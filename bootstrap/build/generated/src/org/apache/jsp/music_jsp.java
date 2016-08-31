package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Lisani.JsoupMusic;

public final class music_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    ArrayList<JsoupMusic> jm = new ArrayList<JsoupMusic>();
    JsoupMusic j = new JsoupMusic();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>作品情報(CD)</title>\n");
      out.write("        <link href=\"css/bootswatch.css\" rel=\"StyleSheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("          <!-- Containers\n");
      out.write("      ================================================== -->\n");
      out.write("    <div class=\"bs-docs-section\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 id=\"containers\">ニュース ＞ 作品情報(CD)</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bs-component\">\n");
      out.write("              <div class=\"jumbotron\">\n");
      out.write("                <h1></h1>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    ");
out.println(j.CD2());
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <p></p>\n");
      out.write("                <p><a class=\"btn btn-primary btn-lg\">Learn more</a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("          \n");
      out.write("    </body>\n");
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
