/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-27 09:45:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class play_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>播放</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/play.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/header.css\">\r\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"play\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 导航栏 -->\r\n");
      out.write("<script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $('.uh').hover(function () {\r\n");
      out.write("                $('.pull').css(\"display\",\"block\")\r\n");
      out.write("            },function () {\r\n");
      out.write("                $('.pull').css(\"display\",\"none\")\r\n");
      out.write("                }\r\n");
      out.write("            )\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $('.pull').hover(function () {\r\n");
      out.write("                $('.pull').css(\"display\",\"block\")\r\n");
      out.write("            },function () {\r\n");
      out.write("                $('.pull').css(\"display\",\"none\")\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"top\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <div class=\"logo\"><a href=\"\"></a></div>\r\n");
      out.write("            <div class=\"option\">\r\n");
      out.write("                <div><a href=\"/music/index\">发现音乐</a></div>\r\n");
      out.write("                <div><a href=\"/music/myMusic?userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getId() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">我的音乐</a></div>\r\n");
      out.write("                <div><a href=\"/music/MV\">发现视频</a></div>\r\n");
      out.write("                <div><a href=\"\">热门排行榜</a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <div class=\"seek\">音乐/视频/用户</div>\r\n");
      out.write("            <div class=\"loginButton\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${none}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                <a href=\"javascript:;\">用户登陆</a>           \r\n");
      out.write("            </div>\r\n");
      out.write("           <div class=\"uh\" style=\"display:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${block}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("               <a style=\"color:none\"><img class=\"userHeader\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getHeader()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></img></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \t\r\n");
      out.write("\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<div class=\"pull\">\r\n");
      out.write("            <div class=\"loginOut\" >\r\n");
      out.write("                <a  href=\"/music/myHome\">我的主页</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"loginOut\" >\r\n");
      out.write("                <a href=\"/music/vip\">VIP会员</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"loginOut\" >\r\n");
      out.write("                <a href=\"/music/edit\">个人设置</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"loginOut\" >\r\n");
      out.write("                <a href=\"/music/loginOut\">退出</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"play-box\">\r\n");
      out.write("    <div class=\"my-music-song\">\r\n");
      out.write("        <div class=\"my-music-list-music ll-music\">\r\n");
      out.write("            <div class=\"mymusic-title\">\r\n");
      out.write("                <img src=\"assets/images/109951164082027968%20(1).jpg\" alt=\"\">\r\n");
      out.write("                <div class=\"mymusic-title-img\">\r\n");
      out.write("                    <img src=\"./assets/images/30.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-title-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("                <div class=\"mymusic-title-username\">歌手:\r\n");
      out.write("                    <a href=\"javascript:;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongAuthor() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-btns\">\r\n");
      out.write("                    <div class=\"mymusic-btns1\">\r\n");
      out.write("                        <img src=\"./assets/images/24.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns2\">\r\n");
      out.write("                        <img src=\"assets/images/27.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns3\">\r\n");
      out.write("                        <img src=\"./assets/images/28.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns4\">\r\n");
      out.write("                        <img src=\"./assets/images/25.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns5\">\r\n");
      out.write("                        <img src=\"./assets/images/29.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns6\">\r\n");
      out.write("                        <img src=\"./assets/images/1.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"play-music\">\r\n");
      out.write("                <audio controls=\"controls\" autoplay=\"autoplay\" preload=\"auto\">\r\n");
      out.write("                    <source src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"audio/ogg\">\r\n");
      out.write("                </audio>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            <div class=\"mymusic-words\">\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongWords() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mymusic-comment\">\r\n");
      out.write("                <div class=\"mymusic-c\">\r\n");
      out.write("                    <div class=\"mymusic-comment-title\">评论</div>\r\n");
      out.write("                    <div class=\"mymusic-comment-num\">\r\n");
      out.write("                        共\r\n");
      out.write("                        <span>0</span>\r\n");
      out.write("                        条评论\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-comment-text\">\r\n");
      out.write("                    <div class=\"mymusic-comment-img\">\r\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getHeader() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"\" style=\"width:100%;height:100%;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <textarea name=\"comm\" id=\"\" cols=\"10\" rows=\"10\" class=\"mymusic-comment-content\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-comment-icon\">\r\n");
      out.write("                    <div class=\"mymusic-comment-icon-1\">\r\n");
      out.write("                        <div class=\"mymusic-comment-icon-2\">140</div>\r\n");
      out.write("                        <div class=\"mymusic-comment-icon-3\">\r\n");
      out.write("                            评论\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mymusic-comment-t\">\r\n");
      out.write("                精彩评论\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"my-music-right\">\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/play.jsp(159,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/play.jsp(159,12) '${scDTOs}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${scDTOs}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/play.jsp(159,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("scDTO");
    // /WEB-INF/play.jsp(159,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("stust");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"mymusic-comment-good\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"mymusic-comment-good-user\">\r\n");
          out.write("\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scDTO.getUser().getHeader() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" alt=\"\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"mymusic-comment-good-name\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scDTO.getUser().getNickName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"mymusic-comment-good-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scDTO.getSongComment().getContent()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"mymusic-comment-time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${scDTO.getSongComment().getComment_time().toString().substring(0,19)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"mymusic-comment-icon\"></div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"mymusic-comment-reply\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">回复</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
