/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-27 08:15:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myMusic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>我的音乐</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/mymusic.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/header.css\">\r\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("<!--我的音乐-->\r\n");
      out.write("<div class=\"my\">\r\n");
      out.write("    <div class=\"my-music\">\r\n");
      out.write("        <!--音乐列表-->\r\n");
      out.write("        <div class=\"my-music-list\">\r\n");
      out.write("   \r\n");
      out.write("            <!--我的歌单-->\r\n");
      out.write("            <div class=\"my-music-list-list\">\t\r\n");
      out.write("                <a href=\"javascript:;\">收藏的歌曲</a>\r\n");
      out.write("                <div class=\"my-music-list-create\">\r\n");
      out.write("                    <a href=\"javascript:;\">搜索</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--歌单中的歌曲-->\r\n");
      out.write("        <div class=\"my-music-song\">\r\n");
      out.write("            <div class=\"my-music-list-music ll-music\">\r\n");
      out.write("            <div class=\"mymusic-title\">\r\n");
      out.write("                <img src=\"assets/images/109951164082027968 (1).jpg\" alt=\"\">\r\n");
      out.write("                <div class=\"mymusic-title-img\">\r\n");
      out.write("                    <img src=\"assets/images/26.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-title-text\">我喜欢的音乐</div>\r\n");
      out.write("                <div class=\"mymusic-title-userimg\">\r\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getHeader() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-title-username\">\r\n");
      out.write("                    <a href=\"javascript:;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getNickName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mymusic-title-datetime\">2017-02-16 &nbsp;创建</div>\r\n");
      out.write("                <div class=\"mymusic-btns\">\r\n");
      out.write("                    <div class=\"mymusic-btns1\">\r\n");
      out.write("                        <img src=\"assets/images/24.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns2\">\r\n");
      out.write("                        <img src=\"assets/images/27.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns3\">\r\n");
      out.write("                        <img src=\"assets/images/28.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns4\">\r\n");
      out.write("                        <img src=\"assets/images/25.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns5\">\r\n");
      out.write("                        <img src=\"assets/images/29.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mymusic-btns6\">\r\n");
      out.write("                        <img src=\"assets/images/1.png\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mymusic-list\">\r\n");
      out.write("                <div class=\"mymusic-list-text\">歌曲列表</div>\r\n");
      out.write("                <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${songs.size() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("首歌</span>\r\n");
      out.write("                <div class=\"mymusic-list-text1\">播放:\r\n");
      out.write("                    <strong>74</strong>\r\n");
      out.write("                    次\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mymusic-song\">\r\n");
      out.write("                <div class=\"mymusic-song-list\">\r\n");
      out.write("                    <div class=\"mymusic-song-1\"></div>\r\n");
      out.write("                    <div class=\"mymusic-song-2\">歌曲标题</div>\r\n");
      out.write("                    <div class=\"mymusic-song-3\">时长</div>\r\n");
      out.write("                    <div class=\"mymusic-song-4\">歌手</div>\r\n");
      out.write("                    <div class=\"mymusic-song-5\">描述</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"mymusic-1\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--新建歌单-->\r\n");
      out.write("<div class=\"create\">\r\n");
      out.write("    <div class=\"create-title\">\r\n");
      out.write("        <div class=\"create-title-text\">新建歌单</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"create-name\">歌单名:</div>\r\n");
      out.write("    <input class=\"create-name-blank\">\r\n");
      out.write("    <div class=\"create-text\">可通过\"收藏\"将音乐添加到歌单中</div>\r\n");
      out.write("    <div class=\"create-btn1\">\r\n");
      out.write("        <div class=\"create-btn1-text\">新建</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"create-btn2\">\r\n");
      out.write("        <div class=\"create-btn2-text\" onclick=\"c()\">取消</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        function c(){\r\n");
      out.write("            var close = document.querySelector(\".create\");\r\n");
      out.write("\r\n");
      out.write("            close.style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var a = $(\".ll\");\r\n");
      out.write("        var b = $(\".ll-music\");\r\n");
      out.write("        var num = 0;\r\n");
      out.write("\r\n");
      out.write("        a.click(function () {\r\n");
      out.write("            num = a.index(this)\r\n");
      out.write("\r\n");
      out.write("            a.css(\"background\",\"#fff\");\r\n");
      out.write("            a.eq(num).css(\"background\",\"#f0f0f0\")\r\n");
      out.write("\r\n");
      out.write("            b.css(\"display\",\"none\")\r\n");
      out.write("            b.eq(num).css(\"display\",\"block\");\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
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
    // /WEB-INF/myMusic.jsp(154,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/myMusic.jsp(154,16) '${songs}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${songs}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/myMusic.jsp(154,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("song");
    // /WEB-INF/myMusic.jsp(154,16) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("stust");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                \r\n");
          out.write("                \t<li class=\"mymusic-li-one\">\r\n");
          out.write("                        <div class=\"mymusic-li-1\">\r\n");
          out.write("                            <div class=\"mymusic-li-2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stust.count }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("                            <img src=\"assets/images/2.png\" alt=\"\">\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <a href=\"/music/play?songId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getId() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><div class=\"mymusic-li-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div></a>\r\n");
          out.write("                        <div class=\"mymusic-li-4\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongTime() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("                        <a href=\"\"><div class=\"mymusic-li-5\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getSongAuthor() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div></a>\r\n");
          out.write("                        <a href=\"\"><div class=\"mymusic-li-6\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${song.getDescription() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div></a>\r\n");
          out.write("                    </li>\r\n");
          out.write("                \r\n");
          out.write("                ");
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