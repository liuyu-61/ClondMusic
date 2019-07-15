package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FileUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import entity.PlayRecordSong;
import entity.Sms;
import entity.Song;
import entity.User;
import net.sf.json.JSONObject;
import service.prototype.ICollectService;
import service.prototype.IPlayRecordService;
import service.prototype.ISongService;
import service.prototype.IUserService;
import sms.JavaSmsApi;
import util.JsonUtil;

@Controller
public class MyHomeController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IPlayRecordService playRecordService;
	
	@Autowired
	private ICollectService collectService;
	@Autowired
	private ISongService songService;
	
	private ModelAndView mv= new ModelAndView();
	
	
	@RequestMapping("/myHome")
	public ModelAndView myHome(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setContentType("text/html; charset=utf-8");
		User user =(User)req.getSession().getAttribute("user");
		if(user==null||user.getId()==0) {
			PrintWriter out = resp.getWriter();
			out.print("<script language=\"javascript\">alert('身份过期了，你需要重新登陆！');window.location.href='/music/index'</script>");
			return null;
		}else{
			long playCount=playRecordService.findCountByUserId(user.getId());
			List<PlayRecordSong> playRecordSongsInWeek=playRecordService.findSongAndCountByUserIdInWeek(user.getId());
			List<PlayRecordSong> playRecordSongs=playRecordService.findSongAndCountByUserId(user.getId());
			List<Song> uploadSongs =songService.searchByUploaderId(user.getId());
			List<Song> collectSongs = collectService.fingByUserId(user.getId());
			if(playCount>=10000000) {
				user.setGrade(8);
			}else if(playCount>=1000000) {
				user.setGrade(7);
			}else if(playCount>=100000) {
				user.setGrade(6);
			}else if(playCount>=10000) {
				user.setGrade(5);
			}else if(playCount>=1000) {
				user.setGrade(4);
			}else if(playCount>=100) {
				user.setGrade(3);
			}else if(playCount>=10) {
				user.setGrade(2);
			}else if(playCount>=1) {
				user.setGrade(1);
			}else {
				user.setGrade(0);
			}
			userService.updateUser(user);
			mv.setViewName("myhome");
			req.setAttribute("playRecordSongsInWeek",playRecordSongsInWeek);
			req.setAttribute("playRecordSongs",playRecordSongs);
			req.setAttribute("playCount",playCount);
			req.setAttribute("uploadSongs",uploadSongs);
			req.setAttribute("collectSongs",collectSongs);
			return mv;
		}
	
		
	}
	
	
	
	@RequestMapping("/edit")
	public ModelAndView edit(){
		mv.setViewName("edit");
		return mv;
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public String save(HttpServletRequest req,HttpServletResponse resp){
		String nickName = req.getParameter("nickName");
		String description = req.getParameter("description");
		String flag = req.getParameter("sex");
		User user = (User)req.getSession().getAttribute("user");
		user.setNickName(nickName);
		user.setDescription(description);
		user.setSex(Boolean.parseBoolean(flag));
		userService.updateUser(user);
		String data="添加成功";
		return data;
	}
	

	@RequestMapping("/uploadImage")
	public ModelAndView uploadImage(){
		mv.setViewName("uploadimage");
		return mv;
	}
	
	/**
	 * springmvc文件上传：
	 */
	@RequestMapping(value="/getHeader",method=RequestMethod.POST)
	@ResponseBody
	public String getHeader(@RequestParam(value = "file", required = false) MultipartFile file,HttpServletRequest req,HttpServletResponse resp) {
		User user = (User)req.getSession().getAttribute("user");
	
		System.out.println(file);
		 System.out.println(user);
		 try {
			 String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			 File desFile=new File("src/main/webapp/assets/images/header-imgs/"+uuid+file.getOriginalFilename());
				FileUtils.writeByteArrayToFile(desFile,file.getBytes());
				user.setHeader("assets/images/header-imgs/"+uuid+file.getOriginalFilename());
				userService.updateUser(user);
				return "t";
			} catch (IOException e) {
				e.printStackTrace();
				return "f";
			}

	}

	//绑顶手机
		@RequestMapping("/bind")
		public ModelAndView bind(){
			mv.setViewName("bind");
			return mv;
		}
		
		
		//发送验证码
		@RequestMapping(value="/Sms",method=RequestMethod.POST)
		@ResponseBody
		public ModelAndView Sms(HttpServletRequest req,HttpServletResponse resp){
			String mobile = req.getParameter("phone");
			System.out.println(mobile);
			Sms sms = new Sms();
			sms.setMobile(mobile);
			
			JavaSmsApi javaSmsApi = new JavaSmsApi();
			try {
				String sendSms = javaSmsApi.sendSms(sms);
				req.getSession().setAttribute("sendSms", sendSms);
				req.getSession().setAttribute("mobile", mobile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			return mv;
		}
		
		//验证验证码
		@RequestMapping(value="/SmsCode",method=RequestMethod.POST)
		@ResponseBody
		public void SmsCode(HttpServletRequest req,HttpServletResponse resp) throws IOException{
			PrintWriter pw = resp.getWriter();
			String code = req.getParameter("code");
			System.out.println(code);

			String sendSms =(String) req.getSession().getAttribute("sendSms");
			System.out.println(sendSms);
			String mobile =(String) req.getSession().getAttribute("mobile");
			System.out.println(mobile);
			User user = (User)req.getSession().getAttribute("user");
			System.out.println(user);
			if(sendSms.equals(code)){
				user.setPhone(Long.parseLong(mobile));
				userService.updateUser(user);
				req.getSession().removeAttribute("sendSms");
				req.getSession().removeAttribute("mobile");
				resp.setContentType("test/javascript;charset=utf-8");
				String success = "{\"result\":\"绑定成功\"}";
				JSONObject json = JsonUtil.toJson(success);
				pw.write(json.toString());
			}else{
				String fail = "{\"result\":\"绑定失败\"}";
				JSONObject json = JsonUtil.toJson(fail);
				pw.write(json.toString());
			}

		}
		
		//解绑手机
			@RequestMapping("/unbind")
			public ModelAndView unbind(){
				mv.setViewName("unbind");
				return mv;
			}
			//验证验证码
			@RequestMapping(value="/SmsCode2",method=RequestMethod.POST)
			@ResponseBody
			public void SmsCode2(HttpServletRequest req,HttpServletResponse resp) throws IOException{
				PrintWriter pw = resp.getWriter();
				String code = req.getParameter("code");
				System.out.println(code);

				String sendSms =(String) req.getSession().getAttribute("sendSms");
				System.out.println(sendSms);

				User user = (User)req.getSession().getAttribute("user");
				System.out.println(user);
				if(sendSms.equals(code)){
					user.setPhone((long)0);
					userService.updateUser(user);
					req.getSession().removeAttribute("sendSms");
					resp.setContentType("test/javascript;charset=utf-8");
					String success = "{\"result\":\"解绑成功\"}";
					JSONObject json = JsonUtil.toJson(success);
					pw.write(json.toString());
				}else{
					String fail = "{\"result\":\"解绑失败\"}";
					JSONObject json = JsonUtil.toJson(fail);
					pw.write(json.toString());
				}

			}
	
	
	
	
	

}
