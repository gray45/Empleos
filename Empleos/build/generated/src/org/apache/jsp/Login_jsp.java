package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cr.ac.una.prograiv.project.domain.Usuario;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jspf");
    _jspx_dependants.add("/menu.jspf");
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
      out.write("<head>\n");
      out.write("  <title>Empleos</title>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/botsnip.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/slidr.css\" type=\"text/css\"/>\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/header.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <div class=\"col-md-12\" id=\"header1\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/header.css\" type=\"text/css\"/>\n");
      out.write("<div>\n");
      out.write("    <div class=\"col-md-7\"></div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <img id=\"logo\" src=\"img/logo2.png\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-2\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        Usuario user= (Usuario) session.getAttribute("usuario");
        if (user!=null){
      out.write("\n");
      out.write("              <li><a href=\"index.jsp\"><button type=\"button\" class=\"btn btn-success\">");
      out.print(user.getUserName());
      out.write("</button></a>\n");
      out.write("                <ul  > <li> <a href=\"#\"><button type=\"button\" class=\"btn btn-warning\">Logout</button></a></li> </ul>\n");
      out.write("              </li>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            ");
 if (user==null){
      out.write("\n");
      out.write("            \n");
      out.write("            <li id=\"botonini\"><a href=\"Login.jsp\"><button type=\"button\" class=\"btn btn-danger\">Iniciar-Sesión</button></a></li>\n");
      out.write("              \n");
      out.write("            ");
 }
        
      out.write("  \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-12 divprin\">\n");
      out.write("            <div class=\"col-md-3\" id=\"leftcolumn\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"hidden-xs display-table-cell v-align box\" id=\"navigation\">\n");
      out.write("                \n");
      out.write("                <div class=\"navi\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Login.jsp\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">LOGIN</span></a></li>\n");
      out.write("                        <li><a href=\"registrarOferente.jsp\"><i class=\"fa fa-user-secret\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Agregar Oferentes</span></a></li>\n");
      out.write("                        <li><a href=\"listaOferentes.jsp\"><i class=\"fa fa-list-alt \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Lista de Oferentes</span></a></li>\n");
      out.write("                        <li><a href=\"registrarEmpresa.jsp\"><i class=\"fa fa-building \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Agregar Empresa</span></a></li>\n");
      out.write("                        <li><a href=\"listaEmpresas.jsp\"><i class=\"fa fa-list-alt \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Listar Empresas</span></a></li>\n");
      out.write("                        <li><a href=\"registrarUsuario.jsp\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Agregar Usuairios</span></a></li>\n");
      out.write("                        <li><a href=\"listaUsuarios.jsp\"><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Lista de Usuarios</span></a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\" id=\"content\">\n");
      out.write("                <div class=\"row main\">\n");
      out.write("\t\t\t\t<div class=\"main-login main-center\">\n");
      out.write("\t\t\t\t<h2>LOGIN</h2>\n");
      out.write("\t\t\t\t\t<form class=\"\" method=\"post\" action=\"Login\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"name\" class=\"cols-sm-2 control-label\">Nombre de Usuario</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-5\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"username\" id=\"name\"  placeholder=\"Nombre\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-5\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-key fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"password\" id=\"email\"  placeholder=\"Password\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                                \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("                                                        <input class=\"btn btn-primary btn-lg btn-block login-button\" type=\"submit\" value=\"Ingresar\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
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
}
