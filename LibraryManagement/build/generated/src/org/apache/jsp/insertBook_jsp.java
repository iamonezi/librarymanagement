package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Add a new book</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <script\n");
      out.write("        type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("    <!-- Custom Theme files -->\n");
      out.write("    <link rel=\"icon\" href=\"image/logo.png\">\n");
      out.write("    <link href=\"css/style_signupUser.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    <!-- //Custom Theme files -->\n");
      out.write("    <!-- web font -->\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("    <!-- //web font -->\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"javascript.js\"> </script>    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- n -->\n");
      out.write("    <div class=\"main-w3layouts wrapper\">\n");
      out.write("        <h1><u>Add a new book</u></h1>\n");
      out.write("        <div class=\"main-agileinfo\">\n");
      out.write("            <div class=\"agileits-top\">\n");
      out.write("                <form action=\"InsertBook\" method=\"post\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"img\" placeholder=\"img\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"book_name\" placeholder=\"book_name\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"author\" placeholder=\"author\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"language\" placeholder=\"language\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"type\" placeholder=\"type\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"publisher\" placeholder=\"publisher\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"publishing_year\" placeholder=\"publishing_year\" required=\"\">\n");
      out.write("                    <input class=\"text email\" type=\"text\" name=\"amount\" placeholder=\"amount\" required=\"\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"ADD BOOK\">\n");
      out.write("                </form>\n");
      out.write("                <p>View all available books!!!<a href=\"Detailbook\"> View</a></p>\n");
      out.write("            </div>\n");
      out.write("        <!-- //copyright -->\n");
      out.write("        <ul class=\"colorlib-bubbles\">\n");
      out.write("            <li></li>\n");
      out.write("        </div>\n");
      out.write("        <!-- copyright -->\n");
      out.write("        <div class=\"colorlibcopy-agile\">\n");
      out.write("<p>© 2018 Libary Signup Form. </p>\n");
      out.write("        </div>\n");
      out.write("        <!-- //copyright -->\n");
      out.write("        <ul class=\"colorlib-bubbles\">\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- //main -->    </body>\n");
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
