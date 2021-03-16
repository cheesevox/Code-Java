package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cheeesevox.dto.RegistractionErrorObject;
import cheeesevox.daos.RegistractionDAO;

public final class right_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index.jsp");
  }

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

      out.write("\n");
      out.write("<aside class=\"col-right\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERNAME ==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          out.write("\n");
          out.write("\n");
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
          out.write("        <h2>Login Page</h2>\n");
          out.write("        ");
/*
            String username = "";
            String password = "";
            RegistractionErrorObject errorObj =(RegistractionErrorObject) request.getAttribute("");
            if(errorObj !=null){
                username= errorObj.getUsernameError();
                password= errorObj.getUsernameError();
                if(username==null){
                    username ="";
                }
                if(password==null){
                    password = "";
                }
            }
            String txtUsername = request.getParameter("txtUsername");
            if(txtUsername = null){
                txtUsername="";
            }
    }
             */
        
          out.write("\n");
          out.write("        <form action=\"MainController\" method=\"POST\">\n");
          out.write("            ");
          out.write("\n");
          out.write("            Username: <input type=\"text\" name=\"txtUsername\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("            <font color=\"red\">\n");
          out.write("            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.usernameError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("            </font><br/>\n");
          out.write("            Password: <input type=\"password\" name=\"txtPassword\"/>\n");
          out.write("            <font color=\"red\">\n");
          out.write("            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INVALID.passwordError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("            </font>\n");
          out.write("            <br/>\n");
          out.write("            <input type=\"submit\" name=\"action\" value=\"Login\"/>\n");
          out.write("        </form>\n");
          out.write("            <a href=\"insert.jsp\"></a>\n");
          out.write("    </body>\n");
          out.write("</html>\n");
          out.write("\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERNAME eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <h2>Welcome, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERNAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h2>\n");
        out.write("            ");
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
}
