package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Member</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontawesome/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styleabout.css\">\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.png\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Page Loader -->\n");
      out.write("        <div id=\"loader-wrapper\">\n");
      out.write("            <div id=\"loader\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"loader-section section-left\"></div>\n");
      out.write("            <div class=\"loader-section section-right\"></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <a href=\"help.html\"><img class=\"help\" src=\"img/help.png\" alt=\"\" ></a>\n");
      out.write("        <a href=\"contact.html\"> <img class=\"contact\" src=\"img/call.png\" alt=\"\"></a>\n");
      out.write("        <a href=\"#lookingfor\" > <img class=\"lookingfor\" src=\"img/lookingfor.png\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("        <!-- Button Float Right Bottom Side -->\n");
      out.write("\n");
      out.write("        <a href=\"#\"><img class=\"register\" src=\"img/edit.png\" alt=\"\"><p class=\"register-1\">  Register to borrow books</p> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"home\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"\" class=\"fas fa-film mr-2\" style=\"width: 50px; height:50px; \">\n");
      out.write("                    FPT Library\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-1\" aria-current=\"page\" href=\"home\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-2\" href=\"print\">Cart</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-3 active\" href=\"about.jsp\">About</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"tm-hero d-flex justify-content-center align-items-center\" data-parallax=\"scroll\" data-image-src=\"img/Cover_page.jpg\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid tm-mt-60\">\n");
      out.write("            <div class=\"row mb-4\">\n");
      out.write("                <h2 class=\"col-12 tm-text-primary\">\n");
      out.write("                    About FPT Library\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row tm-mb-74 tm-row-1640\">            \n");
      out.write("                <div class=\"col-lg-5 col-md-6 col-12 mb-3\">\n");
      out.write("                    <img src=\"img/libraryCT.jpg\" alt=\"Image\" class=\"img-fluid\" style=\"width: 500px; height: 300px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-7 col-md-6 col-12\">\n");
      out.write("                    <div class=\"tm-about-img-text\">\n");
      out.write("                        <p class=\"mb-4\">\n");
      out.write("                            <b>FPT Library website</b> was established when implementing the PRJ291 subject project of <a href=\"https://cantho.fpt.edu.vn/thay-quach-luyl-da-khi-ta-theo-duoi-dam-me-thanh-cong-tu-khac-se-den\"><b>Mr. Quach Luyl Da</b></a>. Project with a combination of three parts: Front-End(WED201), Back-End(PRO192), Database(DBI201). We had to work, create many hours to have a dynamic website like this.</p>\n");
      out.write("                        <p>\n");
      out.write("                            This is a brand new, online library website. We bring you a great experience. <b>We help you learn about books before you go to the actual library to borrow them</b>. The website helps you preview books, book appointments, and return books. Helping librarians manage books more easily and conveniently.</p> \n");
      out.write("                        <p>\n");
      out.write("                            You can support our website by making a small donation via <b>Viettel Money</b>. This will be helpful to us. We hope you enjoy your experience using our website. We are upgrading to meet the needs of users.</p>\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Row 1 -->\n");
      out.write("\n");
      out.write("            <div class=\"row tm-mb-50\">\n");
      out.write("                <div class=\"col-md-4 col-12\" style=\"padding: 5px 10px 5px 10x;\">\n");
      out.write("                    <div class=\"tm-about-3-col\" id=\"founder-4\"> \n");
      out.write("\n");
      out.write("                        <img src=\"img/Tai.jpg\" id=\"img-resize\">\n");
      out.write("\n");
      out.write("                        <header>\n");
      out.write("                            <h3 class=\"name-founder\">Nguyen Duc Tai \n");
      out.write("                                <hr>\n");
      out.write("                                CE160859\n");
      out.write("                            </h3>\n");
      out.write("                        </header>\n");
      out.write("\n");
      out.write("                    </div>       \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-12\" style=\"padding: 5px 10px 5px 5px;\">\n");
      out.write("                    <div class=\"tm-about-3-col\" id=\"founder-5\">  \n");
      out.write("                        <img src=\"img/Metor.jpg\" id=\"img-resize\">\n");
      out.write("\n");
      out.write("                        <header>\n");
      out.write("                            <h3 class=\"name-founder\">Quach Luyl Da\n");
      out.write("                                <hr>\n");
      out.write("                                Mentor\n");
      out.write("                            </h3>\n");
      out.write("                        </header>\n");
      out.write("\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-12\" style=\"padding: 5px 10px 5px 0\">\n");
      out.write("                    <div class=\"tm-about-3-col\" id=\"founder-6\"> \n");
      out.write("                        <img src=\"img/Thu.jpg\" id=\"img-resize\">\n");
      out.write("\n");
      out.write("                        <header>\n");
      out.write("                            <h3 class=\"name-founder\">Pham Minh Thu\n");
      out.write("                                <hr>\n");
      out.write("                                CE160468\n");
      out.write("                            </h3>\n");
      out.write("                        </header>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Row 2 -->\n");
      out.write("\n");
      out.write("                <div class=\"row tm-mb-50\">\n");
      out.write("                    <div class=\"col-md-4 col-12\" style=\"padding: 5px 10px 5px 10x;\">\n");
      out.write("                        <div class=\"tm-about-3-col posi\" id=\"founder-1\"> \n");
      out.write("                            <img src=\"img/Nhan.jpg\" id=\"img-resize\">\n");
      out.write("                            <header>\n");
      out.write("                                <h3 class=\"name-founder\">Vo Viet Nhan \n");
      out.write("                                    <hr>\n");
      out.write("                                    CE160937\n");
      out.write("                                </h3>\n");
      out.write("                            </header>\n");
      out.write("\n");
      out.write("                        </div>       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-12\" style=\"padding: 5px 10px 5px 10x;\">\n");
      out.write("                        <div class=\"tm-about-3-col\" id=\"founder-2\">  \n");
      out.write("                            <img src=\"img/ToiTV.jpg\" id=\"img-resize\">\n");
      out.write("\n");
      out.write("                            <header>\n");
      out.write("                                <h3 class=\"name-founder\">Tran Van Toi \n");
      out.write("                                    <hr>\n");
      out.write("                                    CE160459\n");
      out.write("                                </h3>\n");
      out.write("                            </header>\n");
      out.write("\n");
      out.write("                        </div>                \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-12\" style=\"padding: 5px 10px 5px 10x;\">\n");
      out.write("                        <div class=\"tm-about-3-col\" id=\"founder-3\"> \n");
      out.write("                            <img src=\"img/duy.jpg\" id=\"img-resize\">\n");
      out.write("\n");
      out.write("                            <header>\n");
      out.write("                                <h3 class=\"name-founder\">Nguyen Thanh Quang Duy\n");
      out.write("                                    <hr>\n");
      out.write("                                    CE161080\n");
      out.write("                                </h3>\n");
      out.write("                            </header>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <footer class=\"tm-bg-gray pt-5 pb-3 tm-text-gray tm-footer\">\n");
      out.write("                    <div class=\"container-fluid tm-container-small\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6 col-md-12 col-12 px-5 mb-5\">\n");
      out.write("                                <h3 class=\"tm-text-primary mb-4 tm-footer-title\">About FPT Library</h3>\n");
      out.write("                                <p><a rel=\"sponsored\" href=\"https://v5.getbootstrap.com/\">FPT</a> Officially established on September 8, 2006 under the Prime Minister's Decision, FPT University became the first university in Vietnam established by an enterprise with 100% investment capital from the Corporation.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                                <h3 class=\"tm-text-primary mb-4 tm-footer-title\">Our Links</h3>\n");
      out.write("                                <ul class=\"tm-footer-links pl-0\">\n");
      out.write("                                    <li><a href=\"#\">Cart</a></li>\n");
      out.write("                                    <li><a href=\"#\">Support</a></li>\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                                <ul class=\"tm-social-links d-flex justify-content-end pl-0 mb-5\">\n");
      out.write("                                    <li class=\"mb-2\"><a href=\"https://facebook.com\"><i class=\"fab fa-facebook\"></i></a></li>\n");
      out.write("                                    <li class=\"mb-2\"><a href=\"https://twitter.com\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                                    <li class=\"mb-2\"><a href=\"https://instagram.com\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                                    <li class=\"mb-2\"><a href=\"https://pinterest.com\"><i class=\"fab fa-pinterest\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <a href=\"#\" class=\"tm-text-gray text-right d-block mb-2\">Terms of Use</a>\n");
      out.write("                                <a href=\"#\" class=\"tm-text-gray text-right d-block\">Privacy Policy</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-8 col-md-7 col-12 px-5 mb-3\">\n");
      out.write("                                Copyright 2022 FPT Company. All rights reserved .\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-4 col-md-5 col-12 px-5 text-right\">\n");
      out.write("                                Designed by <a href=\"https://templatemo.com\" class=\"tm-text-gray\" rel=\"sponsored\" target=\"_parent\">Taind and Group2</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("                <script src=\"js/plugins.js\"></script>\n");
      out.write("                <script>\n");
      out.write("                    $(window).on(\"load\", function () {\n");
      out.write("                        $('body').addClass('loaded');\n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write("                </body>\n");
      out.write("                </html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item mx-2\">\n");
        out.write("                                <a class=\"nav-link nav-link-1 \">Hello: Guest</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item mx-2\">\n");
        out.write("                                <a class=\"nav-link nav-link-1 \">Hello: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item mx-2\">\n");
        out.write("                                <a href=\"firstpage.jsp\" class=\"nav-link ps-2 cursor-pointer\">\n");
        out.write("                                    Login\n");
        out.write("                                </a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item mx-2\">\n");
        out.write("                                <a href=\"LogoutControl\" class=\"nav-link ps-2 cursor-pointer\">\n");
        out.write("                                    Logout\n");
        out.write("                                </a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
