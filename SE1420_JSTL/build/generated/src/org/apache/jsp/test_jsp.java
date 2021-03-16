package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/body.jsp");
    _jspx_dependants.add("/right.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Apple web 1</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"codetomake.com\">\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"header\">\n");
      out.write("<div class=\"top\">\n");
      out.write("\n");
      out.write("<div class=\"social\">\n");
      out.write("\t<a href=\"#\"><i class=\"fa fa-facebook-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t<a href=\"#\"><i class=\"fa fa-twitter-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t<a href=\"#\"><i class=\"fa fa-pinterest-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t<a href=\"#\"><i class=\"fa fa-google-plus-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t<a href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"search\">\n");
      out.write("<form method=\"post\">\n");
      out.write("<input type=\"text\" name=\"keyword\" placeholder=\"Search...\">\n");
      out.write("<input type=\"submit\" value=\"search\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"head\">\n");
      out.write("<a href=\"#\" class=\"logo\" alt=\"codetomake.com\" title=\"codetomake.com\">\n");
      out.write("<em>Codetomake.com</em>\n");
      out.write("</a>\n");
      out.write("<a href=\"https://codetomake.com\" class=\"top-banner\" alt=\"codetomake.com\" title=\"codetomake.com\">\n");
      out.write("<img src=\"img/banner-468-60.jpg\" width=\"468\" height=\"60\" alt=\"codetomake.com\" title=\"codetomake.com\">\n");
      out.write("</a>\n");
      out.write("</div>\n");
      out.write("<nav>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"index.html\" class=\"active\">Home</a></li>\n");
      out.write("\t\t<li><a href=\"portfolio.html\">Portfolio</a></li>\n");
      out.write("\t\t<li><a href=\"articles.html\">Articles</a></li>\n");
      out.write("\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t<li><a href=\"full-width.html\">Full width</a></li>\n");
      out.write("\t\t<li class=\"dropdown\"><a href=\"#\">Drop down</a>\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t<li><a href=\"#\">Item 1</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Item 2</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Item 3</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("</nav>\n");
      out.write("</header>\n");
      out.write("    <section class=\"slider\">\n");
      out.write("<div class=\"inner\">\n");
      out.write("<img src=\"img/slider1.jpg\" width=\"960\" height=\"171\" alt=\"codetomake.com\" title=\"codetomake.com\">\n");
      out.write("</div>\n");
      out.write("</section>");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"main\">\n");
      out.write("<section class=\"col-main\">\n");
      out.write("<h1>Main content</h1>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("\"<b>Apple web 1</b>\" released for free under a \"<a rel=\"license\" href=\"http://creativecommons.org/licenses/by/4.0/\">Creative Commons Attribution 4.0 International License</a>\" Which states that you are free for modifying and/or redistributing this work under the following terms: <b>1.</b> You must attribute the work by linking back to \"<a href=\"https://codetomake.com\">codetomake.com</a>\". <b>2.</b> For any reuse or distribution, you must make clear to others the license terms of this work. <b>3.</b> Any of these conditions can be waived if you get permission from \"codetomake.com\".\n");
      out.write("If you intend to use this template I would be so proud if you let me know.\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("<div class=\"float-left\">\n");
      out.write("<ul>\n");
      out.write("\t<li><a href=\"#\">Lorem ipsum dolor sit amet</a></li>\n");
      out.write("\t<li><a href=\"#\">Consectetur adipiscing elit</a></li>\n");
      out.write("\t<li><a href=\"#\">Maecenas sit amet pretium urna</a></li>\n");
      out.write("\t<li><a href=\"#\">Purus leo tincidunt eros</a></li>\n");
      out.write("\t<li><a href=\"#\">Vivamus venenatis velit nec</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"float-left\">\n");
      out.write("<ul>\n");
      out.write("\t<li><a href=\"#\">Maecenas sit amet pretium urna</a></li>\n");
      out.write("\t<li><a href=\"#\">Vivamus venenatis velit nec</a></li>\n");
      out.write("\t<li><a href=\"#\">Consectetur adipiscing elit</a></li>\n");
      out.write("\t<li><a href=\"#\">Lorem ipsum dolor sit amet</a></li>\n");
      out.write("\t<li><a href=\"#\">Purus leo tincidunt eros</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<h2>Praesent scelerisque tortor sed accumsan convallis. </h2>\n");
      out.write("<hr>\n");
      out.write("<img class=\"thumb_medium\" src=\"img/thumb/demo-img-250-130.jpg\" alt=\"\">\n");
      out.write("<img class=\"thumb_medium\" src=\"img/thumb/demo-img-250-130.jpg\" alt=\"\">\n");
      out.write("<img class=\"thumb_medium\" src=\"img/thumb/demo-img-250-130.jpg\" alt=\"\">\n");
      out.write("\n");
      out.write("</section>");
      out.write("\n");
      out.write("        ");
      out.write("<aside class=\"col-right\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("\t\t<h2>Lorem ipsum dolor</h2>\n");
      out.write("\t\tLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis velit nec neque ultricies, eget elementum magna tristique.\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"box\">\n");
      out.write("\t\t<h2>Lorem ipsum dolor</h2>\n");
      out.write("\t\tLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis.\n");
      out.write("\t\t\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t\n");
      out.write("\t\t<h2>Social</h2>\n");
      out.write("\t\t<div class=\"font-awesome\">\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-facebook-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-twitter-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-pinterest-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-google-plus-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin-square fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-tumblr-square  fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t<div class=\"font-awesome\">\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-cc-mastercard fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-cc-visa fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-cc-discover fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t\t<a href=\"#\"><i class=\"fa fa-cc-paypal fa-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</aside>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        ");
      out.write("<footer>\n");
      out.write("<div class=\"ftop\">\n");
      out.write("Copyright &copy; 2017 - All rights reserved <a href=\"https://codetomake.com\">codetomake.com</a>\n");
      out.write("<br>\n");
      out.write("Fully compatible for all major browsers. - <a href=\"#\">About Us</a> | <a href=\"#\">Contact Us</a> | <a href=\"#\">Terms & Conditions</a>\n");
      out.write("</div>\n");
      out.write("<div class=\"fbottom\">\n");
      out.write("<small>Template by <a href=\"https://codetomake.com\">codetomake.com</a> / Font Awesome by Dave Gandy - <a href=\"http://fontawesome.io\">fontawesome.io</a></small>\n");
      out.write("</div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
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
