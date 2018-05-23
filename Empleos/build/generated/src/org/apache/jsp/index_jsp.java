package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.util.ArrayList;
import cr.ac.una.prograiv.project.Dao.PuestoDao;
import java.util.List;
import cr.ac.una.prograiv.project.domain.Puesto;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jspf");
    _jspx_dependants.add("/menu.jspf");
    _jspx_dependants.add("/slidr.jspf");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Inicio</title>\n");
      out.write("<!--[if IE]><script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/botsnip.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/slidr.css\" type=\"text/css\"/>\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1\" crossorigin=\"anonymous\">\n");
      out.write("\n");
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
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 if( request.getAttribute("puestos")!=null){
    List<Puesto> puestos= (List<Puesto>) request.getAttribute("puestos");
}else{
 List<Puesto> puestos = new ArrayList<Puesto>();
        }

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"slider\">\n");
      out.write("    <ul>\n");
      out.write("    ");
/*
        List<Puesto> puestos;
        PuestoDao daopu=new PuestoDao();
        puestos=daopu.findAll();
        
       if(!puestos.isEmpty()){
        for(Puesto puesto: puestos){
        out.println("<li>");
        
         out.println("<table class='table table-striped'>");
         out.println("<th scope='col'>Id Puesto<th>");
         out.println("<th scope='col'>Id Descripcion<th>");
         out.println("<th scope='col'>Id Sueldo<th>");
         out.println("<th scope='col'>Id Empresa<th>");
         out.println("<th scope='col'>Id Tipo<th>");
        
            out.println("<tr>");
            
            out.println("<td>");
            out.println(puesto.getIdPuesto());
            out.println("</td>");
            
            out.println("<td>");
            out.println(puesto.getDescripcion());
            out.println("</td>");
            
            out.println("<td>");
            out.println(puesto.getSueldo());
            out.println("</td>");
            
            out.println("<td>");
            out.println(puesto.getEmpresa().getNombre());
            out.println("</td>");
            
            out.println("<td>");
            out.println(puesto.getTipo());
            out.println("</td>");
            
            out.println("</tr>");
        }
        out.println("<table>");
       }
     */   
    
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("            <img src=\"http://dominicushoeve.com/wp-content/uploads/ktz/latest-high-resolution-wallpaper-1920x1080-70558-pictures-high-resolution-wallpaper-30whtvl34j4r12m8b0c1sa.jpg\" alt=\"\">\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <img src=\"http://youghaltennisclub.ie/wp-content/uploads/2014/06/Tennis-Wallpaper-High-Definition-700x300.jpg\" alt=\"\">\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <img src=\"http://welltechnically.com/wp-content/uploads/2013/08/android-wallpapers-700x300.jpg\" alt=\"\">\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <img src=\"http://welltechnically.com/wp-content/uploads/2013/09/android-widescreen-wallpaper-14165-hd-wallpapers-700x300.jpg\" alt=\"\">\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("               \n");
      out.write("                dom=\"Daniel Mora        114730950 \\n\\Greivin Rojas      402110275 \\n\\Ismael Salazar     402120199\";\n");
      out.write("                alert(dom);\n");
      out.write("            </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
