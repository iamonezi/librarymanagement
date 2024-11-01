package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUpUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>User Sign Up</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link rel=\"icon\" href=\"image/logo.png\">\n");
      out.write("        <link href=\"css/style_signupUser.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- //Custom Theme files -->\n");
      out.write("        <!-- web font -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("        <!-- //web font -->\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"javascript.js\"></script>    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- n -->\n");
      out.write("        <div class=\"main-w3layouts wrapper\">\n");
      out.write("            <a href=\"firstpage.jsp\"><img src=\"image/back_..png\" alt=\"button back\" style=\"position: relative; width: 50px; left: 1%;\"></a>\n");
      out.write("            <h1><u>User Sign Up</u></h1>\n");
      out.write("            <div class=\"main-agileinfo\">\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <div class=\"agileits-top\">\n");
      out.write("                    <form action=\"userSignUpControl\" method=\"post\" name=\"myform\" onsubmit=\"return Openform()\">\n");
      out.write("                        <input class=\"text\" type=\"text\" name=\"fullName\" placeholder=\"Name\" required=\"\">\n");
      out.write("                        <input class=\"text email\" type=\"text\" name=\"phone\" placeholder=\"Number phone\" required=\"\" >\n");
      out.write("                        <input class=\"text email\" type=\"text\" name=\"citizen_identity_card\" placeholder=\"Citizen identity card\" required=\"\">\n");
      out.write("                        <input class=\"text email\" type=\"text\" name=\"address\" placeholder=\"Address\" required=\"\">\n");
      out.write("                        <input class=\"text email\" type=\"text\" name=\"mail\" placeholder=\"Mail\" required=\"\">\n");
      out.write("                        <input class=\"text email\" type=\"text\" name=\"account\" placeholder=\"Account\" required=\"\">\n");
      out.write("                        <input class=\"text w3lpass\" type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                        <div class=\"wthree-text\">\n");
      out.write("                            <label class=\"anim\">\n");
      out.write("                                <input type=\"checkbox\" class=\"checkbox\" required=\"\">\n");
      out.write("                                <span>I Agree To The Terms & Conditions</span>\n");
      out.write("                            </label>\n");
      out.write("                            <div class=\"clear\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" value=\"SIGNUP\">\n");
      out.write("                    </form>\n");
      out.write("                    <p>You already have an Account? <a href=\"loginUser.jsp\"> Login Now!</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- copyright -->\n");
      out.write("            <div class=\"colorlibcopy-agile\">\n");
      out.write("                <p>© 2018 Libary Signup Form. </p>\n");
      out.write("            </div>\n");
      out.write("            <!-- //copyright -->\n");
      out.write("            <ul class=\"colorlib-bubbles\">\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("                <li></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
