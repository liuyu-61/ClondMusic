/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-03 10:10:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vip_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>充值会员</title>\r\n");
      out.write("    <link href=\"assets/css/vip.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/foot.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/header.css\">\r\n");
      out.write("    <script src=\"./assets/js/jquery.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $(\".type\").click(function() {\r\n");
      out.write("                $(\".type\").eq($(this).index()).addClass(\"active\").siblings().removeClass(\"active\");\r\n");
      out.write("                $(\".pay\").hide().eq($(this).index()).show();\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("                <div><a href=\"/music/rank\">热门排行榜</a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <a href=\"/music/search\" class=\"seek\" >音乐/视频/用户</a>\r\n");
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
      out.write("<div class=\"vip-box\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"mine\">\r\n");
      out.write("        <img alt=\"\" class=\"head\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getHeader()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        <div class=\"message\">\r\n");
      out.write("            <div class=\"message-title\">\r\n");
      out.write("                <span class=\"nickname\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getNickName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><span class=\"vip-icon\">vip</span>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"vip-enable\">\r\n");
      out.write("                    当前未开通\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"recharge\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"types\">\r\n");
      out.write("            <div class=\"type active\">\r\n");
      out.write("                <p class=\"line-one\">\r\n");
      out.write("                    <span class=\"price\">4.8</span>\r\n");
      out.write("                    <span>元每月</span>\r\n");
      out.write("                    <span class=\"old\">11元</span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"desc\">特惠仅限本月</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <hr style=\"height:1px;border:none;border-top:1px dashed #d5d5d5;\" width=\"80%\"/>\r\n");
      out.write("                <p class=\"month\">连续包月</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"type\">\r\n");
      out.write("                <p class=\"line-one\">\r\n");
      out.write("                    <span class=\"price\">15</span>\r\n");
      out.write("                    <span>元</span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"desc\">&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <hr style=\"height:1px;border:none;border-top:1px dashed #d5d5d5;\" width=\"80%\"/>\r\n");
      out.write("                <p class=\"month\">1个月</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"type\">\r\n");
      out.write("                <p class=\"line-one\">\r\n");
      out.write("                    <span class=\"price\">40</span>\r\n");
      out.write("                    <span>元</span>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"desc\">13.33元/月</p>\r\n");
      out.write("                <hr style=\"height:1px;border:none;border-top:1px dashed #d5d5d5;\" width=\"80%\"/>\r\n");
      out.write("                <p class=\"month\">3个月</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"type\">\r\n");
      out.write("                <p class=\"line-one\">\r\n");
      out.write("                    <span class=\"price\">138</span>\r\n");
      out.write("                    <span>元</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"desc\">11.5元/月</p>\r\n");
      out.write("                <hr style=\"height:1px;border:none;border-top:1px dashed #d5d5d5;\" width=\"80%\"/>\r\n");
      out.write("                <p class=\"month\">12个月</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <p class=\"pay-title\">支付方式</p>\r\n");
      out.write("        <div class=\"pay-box\">\r\n");
      out.write("            <div class=\"pay\">\r\n");
      out.write("                <img class=\"pay-ma\" src=\"assets/images/ma1.png\" alt=\"\">\r\n");
      out.write("                <div class=\"pay-desc\">\r\n");
      out.write("                    <p>使用微信、支付宝扫码支付</p>\r\n");
      out.write("                    <div class=\"pay-icon\">\r\n");
      out.write("                        <img alt=\"微信支付\" src=\"assets/images/wx.png\" width=\"18px\">\r\n");
      out.write("                        <img alt=\"支付宝支付\" src=\"assets/images/zfb.png\" width=\"18px\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"pay-price\">4.8</span>\r\n");
      out.write("                    <span>元</span>\r\n");
      out.write("                    <span>(已省<span style=\"color: red\">6.2元</span>)</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <div class=\"pay\">\r\n");
      out.write("            <img class=\"pay-ma\" src=\"assets/images/ma2.png\" alt=\"\">            <div class=\"pay-desc\">\r\n");
      out.write("                <p>使用微信、支付宝扫码支付</p>\r\n");
      out.write("                <div class=\"pay-icon\">\r\n");
      out.write("                    <img src=\"assets/images/wx.png\" alt=\"微信支付\" width=\"18px\">\r\n");
      out.write("                    <img src=\"assets/images/zfb.png\" alt=\"支付宝支付\" width=\"18px\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"pay-price\">15</span>\r\n");
      out.write("                <span>元</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"pay\">\r\n");
      out.write("            <img class=\"pay-ma\" src=\"assets/images/ma3.png\" alt=\"\">            <div class=\"pay-desc\">\r\n");
      out.write("                <p>使用微信、支付宝扫码支付</p>\r\n");
      out.write("                <div class=\"pay-icon\">\r\n");
      out.write("                    <img src=\"assets/images/wx.png\" alt=\"微信支付\" width=\"18px\">\r\n");
      out.write("                    <img src=\"assets/images/zfb.png\" alt=\"支付宝支付\" width=\"18px\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"pay-price\">40</span>\r\n");
      out.write("                <span>元</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"pay\">\r\n");
      out.write("            <img class=\"pay-ma\" src=\"assets/images/ma4.png\" alt=\"\">            <div class=\"pay-desc\">\r\n");
      out.write("                <p>使用微信、支付宝扫码支付</p>\r\n");
      out.write("                <div class=\"pay-icon\">\r\n");
      out.write("                    <img src=\"assets/images/wx.png\" alt=\"微信支付\" width=\"18px\">\r\n");
      out.write("                    <img src=\"assets/images/zfb.png\" alt=\"支付宝支付\" width=\"18px\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"pay-price\">138</span>\r\n");
      out.write("                <span>元</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"vip-img\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"zuihou\">\r\n");
      out.write("    <div class=\"zuihou1\">\r\n");
      out.write("        <div class=\"zuihou11\"></div>\r\n");
      out.write("        <a href=\"\">关于网易</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("        <a href=\"\">客户服务</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("        <a href=\"\">服务条款</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("        <a href=\"\">隐私政策</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("        <a href=\"\">版权投诉指引</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("        <a href=\"\">意见反馈</a>&nbsp;&nbsp;|\r\n");
      out.write("        <div class=\"zuihou12\">\r\n");
      out.write("            UBDF1812版权所有2019-2099&nbsp;&nbsp;山西优逸客有限公司运营：晋网文[2019]7418-741号违法和不良信息举报电话：0351-8300110 举报邮箱：1442286843@qq.com 不服来206教室单挑\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"zuihou13\"></div>\r\n");
      out.write("        <div class=\"zuihou13\"></div>\r\n");
      out.write("        <div class=\"zuihou13\"></div>\r\n");
      out.write("        <div class=\"zuihou13\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
