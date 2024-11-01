package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class firstpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Choose Page</title>\n");
      out.write("        <link rel=\"icon\" href=\"image/logo.png\">\n");
      out.write("\n");
      out.write("        <link href=\"cssbootstrap/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/stylefirstpage.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"jsbootstrap/Jquery.js\"></script>\n");
      out.write("        <script src=\"jsbootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Arima:wght@200&family=Merriweather:ital,wght@1,300&family=Nunito:wght@300&family=Roboto+Condensed:wght@400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <header>\n");
      out.write("                    <a href=\"firstpage.jsp\"><img class=\"logo\" src=\"image/logo2.png\" alt=\"\"></a>\n");
      out.write("                    <p class=\"texthead\">In books lies the soul of the whole past time</p>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"contact\">\n");
      out.write("                    <img class=\"contactt\" src=\"image/call.png\" alt=\"\"> \n");
      out.write("                    <div class=\"nbpp\"><p class=\"nbp\">0939765749</p></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>     \n");
      out.write("            <div class=\"body\">\n");
      out.write("                <div class=\"login\">\n");
      out.write("                    <div class=\"caunoi\"><p class=\"caunoii\">Login, register to use free services at FPT Library. We are committed to quality service.</p></div>\n");
      out.write("                    <div class=\"user\">\n");
      out.write("                        <div class=\"thanh\"></div>\n");
      out.write("                        <img class=\"picture\" src=\"image/team.png\" alt=\"\"> <p class=\"usad\">User</p>\n");
      out.write("                        <a href=\"loginUser.jsp\"><div class=\"loginuser\"> <p class=\"text\">Login</p></div></a>\n");
      out.write("                        <a href=\"SignUpUser.jsp\"><div class=\"signupuser\"><p class=\"text\">Sign Up</p></div></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"admin\">\n");
      out.write("                        <div class=\"thanh\"></div>\n");
      out.write("                        <img class=\"picture\" src=\"image/manager.png\" alt=\"\"> <p class=\"usad a\">Admin</p>\n");
      out.write("                        <a href=\"LoginAdmin.jsp\"><div class=\"loginadmin\"><p class=\"text\">Login</p></div></a>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>    \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"3\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\" data-interval=\"5000\">\n");
      out.write("                        <img src=\"image/book5.jpg\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" data-interval=\"3000\">\n");
      out.write("                        <img src=\"image/book6.jpg\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" data-interval=\"3000\">\n");
      out.write("                        <img src=\"image/book3.png\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" data-interval=\"3000\">\n");
      out.write("                        <img src=\"image/book4.png\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <footer>\n");
      out.write("                    <p class=\"fot\">\n");
      out.write("                        @ made by group 02\n");
      out.write("                    </p>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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
