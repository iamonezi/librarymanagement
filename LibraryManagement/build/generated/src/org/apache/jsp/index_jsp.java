package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Home Page FPT Library</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./fontawesome/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/templatemo-style.css\">\n");
      out.write("    <link rel=\"icon\" href=\"img/logo.png\">\n");
      out.write("<!--\n");
      out.write("    \n");
      out.write("TemplateMo 556 Catalog-Z\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-556-catalog-z\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     <!--Page Loader--> \n");
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
      out.write("               <img src=\"img/logo.png\" alt=\"\" class=\"fas fa-film mr-2\" style=\"width: 50px; height:50px; \">\n");
      out.write("                FPT Library\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fas fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-1 active\" aria-current=\"page\" href=\"index.html\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-2\" href=\"Cart.jsp\">Cart</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link nav-link-3\" href=\"about.jsp\">About</a>\n");
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
      out.write("    <div class=\"tm-hero d-flex justify-content-center align-items-center\" data-parallax=\"scroll\" data-image-src=\"img/background.jpg\">\n");
      out.write("        <form class=\"d-flex tm-search-form\">\n");
      out.write("            <input class=\"form-control tm-search-input\" id=\"lookingfor\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-success tm-search-btn\" type=\"submit\">\n");
      out.write("                <i class=\"fas fa-search\"></i>\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid tm-container-content tm-mt-60\">\n");
      out.write("        \n");
      out.write("        <!-- Button Float Right Side -->\n");
      out.write("\n");
      out.write("        <a href=\"help.html\"><img class=\"help\" src=\"img/help.png\" alt=\"\" ></a>\n");
      out.write("        <a href=\"contact.html\"> <img class=\"contact\" src=\"img/call.png\" alt=\"\"></a>\n");
      out.write("        <a href=\"#lookingfor\" > <img class=\"lookingfor\" src=\"img/lookingfor.png\" alt=\"\"></a>\n");
      out.write(" \n");
      out.write("        <!-- Button Float Right Bottom Side -->\n");
      out.write("\n");
      out.write("        <a href=\"#\"><img class=\"register\" src=\"img/edit.png\" alt=\"\"><p class=\"register-1\">  Register to borrow books</p> </a>\n");
      out.write("\n");
      out.write("        <div class=\"row mb-4\">\n");
      out.write("            <h2 class=\"col-6 tm-text-primary\">\n");
      out.write("                Latest Book\n");
      out.write("            </h2>\n");
      out.write("<!--            <div class=\"col-6 d-flex justify-content-end align-items-center\">\n");
      out.write("                <form action=\"\" class=\"tm-text-primary\">\n");
      out.write("                    Page <input type=\"text\" value=\"1\" size=\"1\" class=\"tm-input-paging tm-text-primary\"> of 200\n");
      out.write("                </form>\n");
      out.write("            </div>-->\n");
      out.write("        </div>\n");
      out.write("<!--        <div class=\"row tm-mb-90 tm-gallery\">\n");
      out.write("        \t<div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach1.png\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">18 Oct 2020</span>\n");
      out.write("                    <span>9,906 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach2.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">14 Oct 2020</span>\n");
      out.write("                    <span>16,100 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach3.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">12 Oct 2020</span>\n");
      out.write("                    <span>12,460 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach4.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Self-help Book</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">10 Oct 2020</span>\n");
      out.write("                    <span>11,402 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach5.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Novel</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">24 Sep 2020</span>\n");
      out.write("                    <span>16,008 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach6.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Self-help Book</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">20 Sep 2020</span>\n");
      out.write("                    <span>12,860 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach7.jfif\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Self-help Book</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">16 Sep 2020</span>\n");
      out.write("                    <span>10,900 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach8.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">12 Sep 2020</span>\n");
      out.write("                    <span>11,300 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach9.jfif\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">10 Sep 2020</span>\n");
      out.write("                    <span>42,700 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach10.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">8 Sep 2020</span>\n");
      out.write("                    <span>11,402 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach11.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Manga</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">4 Sep 2020</span>\n");
      out.write("                    <span>32,906 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach12.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">28 Aug 2020</span>\n");
      out.write("                    <span>50,700 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach13.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Self-help Book</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">22 Aug 2020</span>\n");
      out.write("                    <span>107,510 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach14.jfif\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Manga</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">14 Aug 2020</span>\n");
      out.write("                    <span>118,006 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach15.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Programing</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">9 Aug 2020</span>\n");
      out.write("                    <span>121,300 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5\">\n");
      out.write("                <figure class=\"effect-ming tm-video-item\">\n");
      out.write("                    <img src=\"img/khosach16.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("                    <figcaption class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                        <h2>Self-help Book</h2>\n");
      out.write("                        <a href=\"photo-detail.html\">View more</a>\n");
      out.write("                    </figcaption>                    \n");
      out.write("                </figure>\n");
      out.write("                <div class=\"d-flex justify-content-between tm-text-gray\">\n");
      out.write("                    <span class=\"tm-text-gray-light\">3 Aug 2020</span>\n");
      out.write("                    <span>21,204 views</span>\n");
      out.write("                </div>\n");
      out.write("            </div>         \n");
      out.write("        </div>  row -->\n");
      out.write("<div class=\"row\">\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("        <div class=\"row tm-mb-90\">\n");
      out.write("            <div class=\"col-12 d-flex justify-content-between align-items-center tm-paging-col\">\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"btn btn-primary tm-btn-prev mb-2 disabled\">Previous</a>\n");
      out.write("                <div class=\"tm-paging d-flex\">\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"active tm-paging-link\">1</a>\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"tm-paging-link\">2</a>\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"tm-paging-link\">3</a>\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"tm-paging-link\">4</a>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"btn btn-primary tm-btn-next\">Next Page</a>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("    </div> <!-- container-fluid, tm-container-content -->\n");
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
      out.write("    \n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(window).on(\"load\", function() {\n");
      out.write("            $('body').addClass('loaded');\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listB}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-12 col-md-6 col-lg-4 \">\n");
          out.write("                                <div class=\"card\">\n");
          out.write("                                    <img class=\"card-img-top\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"#\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        <p class=\"card-text show_txt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("<!--                                            <div class=\"col\">\n");
          out.write("                                                <p class=\"btn btn-danger btn-block\">{o.price} $</p>\n");
          out.write("                                            </div>-->\n");
          out.write("                                            <div class=\"col\">\n");
          out.write("                                                <a href=\"#\" class=\"btn btn-success btn-block\">Add to cart</a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
