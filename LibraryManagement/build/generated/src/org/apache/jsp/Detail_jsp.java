package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Book detail</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fontawesome/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\n");
      out.write("     <link rel=\"icon\" href=\"image/logo.png\">\n");
      out.write("<!--\n");
      out.write("    \n");
      out.write("TemplateMo 556 Catalog-Z\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-556-catalog-z\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Page Loader -->\n");
      out.write("    <div id=\"loader-wrapper\">\n");
      out.write("        <div id=\"loader\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"loader-section section-left\"></div>\n");
      out.write("        <div class=\"loader-section section-right\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"home\">\n");
      out.write("                <a class=\"navbar-brand ps-3\" href=\"adminPage.jsp\" style=\"width: 65px; height: 50px; margin-bottom: 17px;  \"><img src=\"image/logo.png\" style=\"position: relative;\n");
      out.write("                                                               width: 50px; height: 50px; margin: 5px;\"></a>\n");
      out.write("               <img src=\"img/logo.png\" alt=\"\" class=\"fas fa-film mr-2\" style=\"width: 50px; height:50px; \">\n");
      out.write("                FPT Library\n");
      out.write("            </a>\n");
      out.write("            <button\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fas fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-3\" href=\"about.jsp\">About</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-1 active\" aria-current=\"page\" href=\"home\">Home</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"tm-hero d-flex justify-content-center align-items-center\" data-parallax=\"scroll\" data-image-src=\"img/Cover_page.jpg\">\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid tm-container-content tm-mt-60\">\n");
      out.write("        <div class=\"row mb-4\">\n");
      out.write("            <h2 class=\"col-12 tm-text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row tm-mb-90\" style=\"\" >            \n");
      out.write("            <div class=\"col-xl-8 col-lg-7 col-md-6 col-sm-12\" style=\"display:flex;align-items:center;justify-content: center;\">\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\" class=\"img-fluid\" style=\"width:50%;\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-4 col-lg-5 col-md-6 col-sm-12\">\n");
      out.write("                <div class=\"tm-bg-gray tm-video-details\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"text-center mb-5\">\n");
      out.write("                        <a href=\"Cart.jsp\" class=\"btn btn-primary tm-btn-big\">Borrow</a>\n");
      out.write("                    </div>                    \n");
      out.write("                    <div class=\"mb-4 d-flex flex-wrap\">\n");
      out.write("                        <div class=\"mr-4 mb-2\">\n");
      out.write("                            <span class=\"tm-text-gray-dark\">Author: </span><span class=\"tm-text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mr-4 mb-2\">\n");
      out.write("                            <span class=\"tm-text-gray-dark\">Language: </span><span class=\"tm-text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mr-4 mb-2\">\n");
      out.write("                            <span class=\"tm-text-gray-dark\">Type: </span><span class=\"tm-text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mr-4 mb-2\">\n");
      out.write("                            <span class=\"tm-text-gray-dark\">Publisher: </span><span class=\"tm-text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mr-4 mb-2\">\n");
      out.write("                            <span class=\"tm-text-gray-dark\">Publishing Year: </span><span class=\"tm-text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mb-4\">\n");
      out.write("                        <h3 class=\"tm-text-gray-dark mb-3\">License</h3>\n");
      out.write("                        <p>Free for both personal and commercial use. No need to pay anything. No need to make any attribution.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"tm-text-gray-dark mb-3\">Tags</h3>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Cloud</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Bluesky</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Nature</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Background</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Timelapse</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Night</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-primary mr-4 mb-2 d-inline-block\">Real Estate</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div> <!-- container-fluid, tm-container-content -->\n");
      out.write("\n");
      out.write("    <footer class=\"tm-bg-gray pt-5 pb-3 tm-text-gray tm-footer\">\n");
      out.write("        <div class=\"container-fluid tm-container-small\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-12 col-12 px-5 mb-5\">\n");
      out.write("                    <h3 class=\"tm-text-primary mb-4 tm-footer-title\">About Catalog-Z</h3>\n");
      out.write("                    <p>Integer ipsum odio, pharetra ac massa ac, pretium facilisis nibh. Donec lobortis consectetur molestie. Nullam nec diam dolor. Fusce quis viverra nunc, sit amet varius sapien.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                    <h3 class=\"tm-text-primary mb-4 tm-footer-title\">Our Links</h3>\n");
      out.write("                    <ul class=\"tm-footer-links pl-0\">\n");
      out.write("                        <li><a href=\"#\">Advertise</a></li>\n");
      out.write("                        <li><a href=\"#\">Support</a></li>\n");
      out.write("                        <li><a href=\"#\">Our Company</a></li>\n");
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
      out.write("                    Copyright 2020 Catalog-Z Company. All rights reserved.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-5 col-12 px-5 text-right\">\n");
      out.write("                    Designed by <a href=\"https://templatemo.com\" class=\"tm-text-gray\" rel=\"sponsored\" target=\"_parent\">TemplateMo</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(window).on(\"load\", function() {\n");
      out.write("            $('body').addClass('loaded');\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
