/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-03 08:46:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>搜索</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/search.css\">\r\n");
      out.write("<script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/foot.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\".searchSong\").click(function() {\r\n");
      out.write("\t\t\tvar keyWord = $(\"input[name = 'keyWord']\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t$(\"ul\").empty();\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\turl : \"/music/searchSong\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tkeyWord : keyWord\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tvar ad = eval(data);\r\n");
      out.write("\t\t\t\t\tvar songs = ad.data.songs\r\n");
      out.write("\t\t\t\t\tconsole.log(songs)\r\n");
      out.write("\t\t\t\t\tvar search = \"搜索<span>\"+keyWord+\"</span>,找到<span style='color: red;'>\"+songs.length+\"</span>首单曲\";\r\n");
      out.write("\t\t\t\t\t$(\".search-box-center\").append(search);\r\n");
      out.write("\t\t\t\t\t$.each(songs,function(i,n){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar str= \"<li class='search-bottom-li'><div class='search-bottom-li-1'>\"\r\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<div class='search-bottom-li-2'></div>\"\r\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<div class='search-bottom-li-3'><a href='/music/play?id=\"+n.songid+\"'>\"+n.name+\"</a></div>\"\r\n");
      out.write("\t\t\t\t\t\t\tstr+=\"<div class='search-bottom-li-4'><a href=''>\"+n.ar[0].name+\"</a></div></div></li>\"\r\n");
      out.write("\t\t\t\t\t\t\t$(\"ul\").append(str);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar input = $(\"input\");\r\n");
      out.write("\t\t\tvar varDef=input.val();\r\n");
      out.write("\t\t\tconsole.log(varDef);\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput.focus(function() {\r\n");
      out.write("\t\t\t\tif(input.val()!='搜索'){\r\n");
      out.write("\t\t\t\t\tinput.val(varDef)\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tinput.val(\"\")\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\tinput.blur(function() {\r\n");
      out.write("\t\t\t\tif(input.val()!=\"\"){\r\n");
      out.write("\t\t\t\t\tinput.val($(this).val())\r\n");
      out.write("\t\t\t\t\tvarDef=input.val();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tinput.val(\"搜索\")\r\n");
      out.write("\t\t\t\t\tconsole.log(varDef)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar a = $(\".search-bottom-num\")\r\n");
      out.write("\t\t\tvar num = 0\r\n");
      out.write("\r\n");
      out.write("\t\t\ta.click(function() {\r\n");
      out.write("\t\t\t\tnum = a.index(this)\r\n");
      out.write("\t\t\t\ta.css(\"background\", \"#fff\")\r\n");
      out.write("\t\t\t\ta.eq(num).css(\"background\", \"red\")\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$('.uh').hover(function() {\r\n");
      out.write("\t\t\t\t$('.pull').css(\"display\", \"block\")\r\n");
      out.write("\t\t\t}, function() {\r\n");
      out.write("\t\t\t\t$('.pull').css(\"display\", \"none\")\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('.pull').hover(function() {\r\n");
      out.write("\t\t\t\t$('.pull').css(\"display\", \"block\")\r\n");
      out.write("\t\t\t}, function() {\r\n");
      out.write("\t\t\t\t$('.pull').css(\"display\", \"none\")\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"top\">\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"option\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/music/index\">发现音乐</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/music/myMusic?userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getId() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">我的音乐</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/music/MV\">发现视频</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">热门排行榜</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<div class=\"seek\">音乐/视频/用户</div>\r\n");
      out.write("\t\t\t\t<div class=\"loginButton\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${none}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">用户登陆</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"uh\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${block}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a style=\"color: none\"><img class=\"userHeader\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getHeader()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></img></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"pull\">\r\n");
      out.write("\t\t\t\t<div class=\"loginOut\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/music/myHome\">我的主页</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"loginOut\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/music/vip\">VIP会员</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"loginOut\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/music/edit\">个人设置</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"loginOut\">\r\n");
      out.write("\t\t\t\t\t<a href=\"/music/loginOut\">退出</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<div class=\"search\">\r\n");
      out.write("\t\t<div class=\"search-box\">\r\n");
      out.write("\t\t\t<div class=\"search-box-top\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"搜索\" name=\"keyWord\"> <a\r\n");
      out.write("\t\t\t\t\thref=\"javascript:;\" class=\"searchSong\">\r\n");
      out.write("\t\t\t\t\t<div class=\"search-box-top1\"></div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"search-box-center\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"search-box-bottom\">\r\n");
      out.write("\t\t\t\t<ul class=\"search-bottom\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- <li class=\"search-bottom-li\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"search-bottom-li-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-bottom-li-2\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-bottom-li-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">cccc</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-bottom-li-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">cccc</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li> -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"search-bottom-1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\"><div class=\"search-bottom-up-page\">\r\n");
      out.write("\t\t\t\t\t\t\t< 上一页</div></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"search-bottom-num sbn\">1</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"search-bottom-num\">2</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"search-bottom-num\">3</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"search-bottom-num\">4</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\"><div class=\"search-bottom-down-page\">\r\n");
      out.write("\t\t\t\t\t\t\t下一页 ></div></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--底部-->\r\n");
      out.write("\t<div class=\"zuihou\">\r\n");
      out.write("\t\t<div class=\"zuihou1\">\r\n");
      out.write("\t\t\t<div class=\"zuihou11\"></div>\r\n");
      out.write("\t\t\t<a href=\"\">关于网易</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a href=\"\">客户服务</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<a href=\"\">服务条款</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a href=\"\">隐私政策</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<a href=\"\">版权投诉指引</a>&nbsp;&nbsp;|&nbsp;&nbsp; <a href=\"\">意见反馈</a>&nbsp;&nbsp;|\r\n");
      out.write("\t\t\t<div class=\"zuihou12\">\r\n");
      out.write("\t\t\t\tUBDF1812版权所有2019-2099&nbsp;&nbsp;山西优逸客有限公司运营：晋网文[2019]7418-741号违法和不良信息举报电话：0351-8300110\r\n");
      out.write("\t\t\t\t举报邮箱：1442286843@qq.com 不服来206教室单挑</div>\r\n");
      out.write("\t\t\t<div class=\"zuihou13\"></div>\r\n");
      out.write("\t\t\t<div class=\"zuihou13\"></div>\r\n");
      out.write("\t\t\t<div class=\"zuihou13\"></div>\r\n");
      out.write("\t\t\t<div class=\"zuihou13\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
