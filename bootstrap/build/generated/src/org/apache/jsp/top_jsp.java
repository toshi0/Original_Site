package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("    <!-- このドキュメントの見た目はhref属性によって参照されるCSSで制御されます。詳細はhttp://www.w3.org/TR/xml-stylesheet/を参照してください。 -->\n");
      out.write("    \n");
      out.write("   <title>アニニュース</title>\n");
      out.write("    <link href=\"css/bootswatch.css\" rel=\"StyleSheet\">\n");
      out.write("   <script>\n");
      out.write("\n");
      out.write("     var _gaq = _gaq || [];\n");
      out.write("      _gaq.push(['_setAccount', 'UA-23019901-1']);\n");
      out.write("      _gaq.push(['_setDomainName', \"bootswatch.com\"]);\n");
      out.write("        _gaq.push(['_setAllowLinker', true]);\n");
      out.write("      _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("     (function() {\n");
      out.write("       var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("       ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("       var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("     })();\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("      <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("      <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <a href=\"top.jsp\" class=\"navbar-brand\">アニニュース</a>\n");
      out.write("          <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-main\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-collapse collapse\" id=\"navbar-main\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" id=\"themes\">ニュース <span class=\"caret\"></span></a>\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"ニュース\">\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"music.jsp\">CD</a></li>\n");
      out.write("                <li><a href=\"brd_dvd.jsp\">アニメ作品/BRD・DVD</a></li>\n");
      out.write("                <li><a href=\"live.jsp\">ライブ</a></li>\n");
      out.write("                <li><a href=\"event.jsp\">イベント</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">お問い合わせ</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">ログイン</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("      <div class=\"page-header\" id=\"banner\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-8 col-md-7 col-sm-6\">\n");
      out.write("            <h1>アニ!WEB</h1>\n");
      out.write("            <p class=\"lead\">アニメ・音楽の情報サイト</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("     <!-- アニ!WEB\n");
      out.write("      ================================================== -->\n");
      out.write("        <p class=\"bs-component\">\n");
      out.write("            <a href=\"music.jsp\" class=\"btn btn-default\">CD</a>\n");
      out.write("            <a href=\"brd_dvd.jsp\" class=\"btn btn-primary\">アニメ作品/BRD・DVD</a>\n");
      out.write("            <a href=\"live.jsp\" class=\"btn btn-success\">ライブ</a>\n");
      out.write("            <a href=\"event.jsp\" class=\"btn btn-info\">イベント</a>\n");
      out.write("            <!--<a href=\"#\" class=\"btn btn-warning\">Warning</a>\n");
      out.write("            <a href=\"#\" class=\"btn btn-danger\">Danger</a>\n");
      out.write("            <a href=\"#\" class=\"btn btn-link\">Link</a>\n");
      out.write("            <img src=\"\">-->\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("                    \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
