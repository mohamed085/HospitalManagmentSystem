package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Home 1</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"../assets/images/favicon.png\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/bootstrap/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/bootstrap/css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/fonts/poppins/poppins.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/fonts/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/jquery-ui/jquery-ui.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/process-bar/tox-progress.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/owl-carouse/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/owl-carouse/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/animsition/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/jquery-ui/jquery-ui.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/mediaelement/mediaelementplayer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/datetimepicker/bootstrap-datepicker3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/datetimepicker/bootstrap-datetimepicker.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/plugin/lightgallery/lightgallery.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <!--load page-->\n");
      out.write("    <div class=\"load-page\">\n");
      out.write("        <div class=\"sk-wave\">\n");
      out.write("            <div class=\"sk-rect sk-rect1\"></div>\n");
      out.write("            <div class=\"sk-rect sk-rect2\"></div>\n");
      out.write("            <div class=\"sk-rect sk-rect3\"></div>\n");
      out.write("            <div class=\"sk-rect sk-rect4\"></div>\n");
      out.write("            <div class=\"sk-rect sk-rect5\"></div>\n");
      out.write("        </div>\n");
      out.write("        <h1>Hello World!</h1>\n");
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
