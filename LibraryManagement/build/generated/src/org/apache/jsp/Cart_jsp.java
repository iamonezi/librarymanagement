package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Cart FPT Library</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fontawesome/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\n");
      out.write("    <link rel=\"icon\" href=\"/web/img/logo.png\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div id=\"loader-wrapper\">\n");
      out.write("        <div id=\"loader\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"loader-section section-left\"></div>\n");
      out.write("        <div class=\"loader-section section-right\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("               <img src=\"/web/img/logo.png\" alt=\"\" class=\"fas fa-film mr-2\" style=\"width: 50px; height:50px; \">\n");
      out.write("                FPT Library\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fas fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-1\" aria-current=\"page\" href=\"index.html\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-2 active\" href=\"Cart.jsp\">Cart</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-3 \" href=\"about.jsp\">About</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-5\" href=\"status.html\"> Status</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-4\" href=\"firstpage.jsp\">Log out</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"your-cart\">\n");
      out.write("        <img src=\"/web/img/shopping-cart.png\" alt=\"\" class=\"cart\"> \n");
      out.write("        <h5>Book in your cart. Right here</h5>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <table class=\"flat-table flat-table-1\">\n");
      out.write("        \n");
      out.write("        <thead>\n");
      out.write("            <th>Order</th>\n");
      out.write("            <th>Book's name</th>\n");
      out.write("            <th>Author</th>\n");
      out.write("            <th>Borrow</th>\n");
      out.write("            <th>Delete</th>\n");
      out.write("        </thead>\n");
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>01</td>\n");
      out.write("                <td>Naruto Chapter 19</td>\n");
      out.write("                <td>Nawazaka</td>\n");
      out.write("                <td><a href=\"#\">Borrow</a></td>\n");
      out.write("                <td><a href=\"#\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>02</td>\n");
      out.write("                <td>Đắc nhân tâm</td>\n");
      out.write("                <td>Phạm Nhật Vượng</td>\n");
      out.write("                <td><a href=\"#\">Borrow</a></td>\n");
      out.write("                <td><a href=\"#\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>03</td>\n");
      out.write("                <td>Lập trình và Cuộc sống</td>\n");
      out.write("                <td>Hoàng IT</td>\n");
      out.write("                <td><a href=\"#\">Borrow</a></td>\n");
      out.write("                <td><a href=\"#\">Delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <footer class=\"tm-bg-gray pt-5 pb-3 tm-text-gray tm-footer\">\n");
      out.write("        <div class=\"container-fluid tm-container-small\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-12 col-12 px-5 mb-5\">\n");
      out.write("                    <h3 class=\"tm-text-primary mb-4 tm-footer-title\">About FPT Library</h3>\n");
      out.write("                    <p><a rel=\"sponsored\" href=\"https://v5.getbootstrap.com/\">FPT</a> Officially established on September 8, 2006 under the Prime Minister's Decision, FPT University became the first university in Vietnam established by an enterprise with 100% investment capital from the Corporation.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                    <h3 class=\"tm-text-primary mb-4 tm-footer-title\">Our Links</h3>\n");
      out.write("                    <ul class=\"tm-footer-links pl-0\">\n");
      out.write("                        <li><a href=\"#\">Cart</a></li>\n");
      out.write("                        <li><a href=\"#\">Support</a></li>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                    <ul class=\"tm-social-links d-flex justify-content-end pl-0 mb-5\">\n");
      out.write("                        <li class=\"mb-2\"><a href=\"https://facebook.com\"><i class=\"fab fa-facebook\"></i></a></li>\n");
      out.write("                        <li class=\"mb-2\"><a href=\"https://twitter.com\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                        <li class=\"mb-2\"><a href=\"https://instagram.com\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                        <li class=\"mb-2\"><a href=\"https://pinterest.com\"><i class=\"fab fa-pinterest\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"#\" class=\"tm-text-gray text-right d-block mb-2\">Terms of Use</a>\n");
      out.write("                    <a href=\"#\" class=\"tm-text-gray text-right d-block\">Privacy Policy</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-md-7 col-12 px-5 mb-3\">\n");
      out.write("                    Copyright 2022 FPT Company. All rights reserved .\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-5 col-12 px-5 text-right\">\n");
      out.write("                    Designed by <a href=\"https://templatemo.com\" class=\"tm-text-gray\" rel=\"sponsored\" target=\"_parent\">Taind and Group2</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(window).on(\"load\", function() {\n");
      out.write("            $('body').addClass('loaded');\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
