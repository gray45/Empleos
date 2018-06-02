package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cr.ac.una.prograiv.project.Dao.EmpresaDao;
import cr.ac.una.prograiv.project.domain.Empresa;
import java.util.List;
import cr.ac.una.prograiv.project.domain.Usuario;
import cr.ac.una.prograiv.project.domain.Usuario;

public final class listaEmpresas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/botsnip.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slidr.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Lista de Empresas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
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
      out.write("                <ul  > <li> <a href=\"Logout\"><button type=\"button\" class=\"btn btn-warning\">Logout</button></a></li> </ul>\n");
      out.write("              </li>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            ");
 if (user==null){
      out.write("\n");
      out.write("            \n");
      out.write("            <li id=\"botonini\"><a href=\"Login.jsp\"><button type=\"button\" class=\"btn btn-warning\">Iniciar-Seccion</button></a></li>\n");
      out.write("            <li id=\"botonini\" ><a href=\"registrarUsuario.jsp\"><button type=\"button\" class=\"btn btn-success\" >Registrarse</button></a></li>\n");
      out.write("              \n");
      out.write("            ");
 }
        
      out.write("  \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-12 divprin\">\n");
      out.write("            <div class=\"col-md-3\" id=\"leftcolumn\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"Js/caracteristicas.js\" type=\"text/javascript\"></script>\n");
      out.write("            ");

                
                Usuario u= (Usuario) session.getAttribute("usuario");
                
            
      out.write("\n");
      out.write("            <div class=\"hidden-xs display-table-cell v-align box\" id=\"navigation\">\n");
      out.write("                \n");
      out.write("                <div class=\"navi\">\n");
      out.write("                    <ul id=\"barra\" class=\"barra\">\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        ");
 if(u!=null){
                            int i= Integer.parseInt(u.getTipo());
                        
      out.write("\n");
      out.write("                        ");

                            if(i==1){
                        /*
                            Generar Reporte
                            Ver Lista de empresas nuevas
                            ver lista de oferentes nuevos
                            Registrar Caracteristicas
                        
                        */
      out.write("\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"Slider\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Home</span></a></li>\n");
      out.write("                        <li><a href=\"listaOferentes.jsp\"><i class=\"fa fa-list-alt \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Lista de Oferentes</span></a></li>\n");
      out.write("                        <li><a href=\"listaEmpresas.jsp\"><i class=\"fa fa-list-alt \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Listar Empresas</span></a></li>\n");
      out.write("                        <li><a href=\"listaUsuarios.jsp\"><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Lista de Usuarios</span></a></li>\n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        ");
 if(i==2){
                        /*
                            Publicar Puestos
                            Buscar Candidatos por caracteristicas
                            ver puestos activos y deshabilitarlos
                            Ver oferentes
                        */
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                           <li><a href=\"Slider\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Home</span></a></li>\n");
      out.write("                           <li><a href=\"registrarPuesto.jsp\"><i class=\"fa fa-list-alt \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Agregar nuevo Puesto</span></a></li>\n");
      out.write("                           <li><a href=\"listaPuestos.jsp\"><i class=\"fa fa-list-alt \" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Lista de Puestos</span></a></li>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
 if(i==3){
                        /*
                           Registrar lista de caracteristicas
                           Subir pdf
                           Ver lista de puestos publicos                        
                        */
                        }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        \n");
      out.write("                        <li id=\"caract\" onclick=\"hijos()\"><a id = \"a\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Caracteristicas</span></a>\n");
      out.write("                         </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\" id=\"content\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"col-md-3\"></div>\n");
      out.write("                    <div class=\"col-md-6\"><h2 align=\"center\">LISTA DE EMPRESAS</h2></div>\n");
      out.write("                    <div class=\"col-md-3\"></div>\n");
      out.write("                </div>\n");
      out.write("               ");
 
                List<Empresa> empresas;
                EmpresaDao da=new EmpresaDao();
                empresas=da.findAll();
            
      out.write("\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">ID</th>\n");
      out.write("                    <th scope=\"col\">Nombre</th>\n");
      out.write("                    <th scope=\"col\">Latitud</th>\n");
      out.write("                    <th scope=\"col\">Longitud</th>\n");
      out.write("                    <th scope=\"col\">Email</th>\n");
      out.write("                    <th scope=\"col\">Telefono</th>\n");
      out.write("                    <th scope=\"col\">Descripcion</th>\n");
      out.write("                    <th scope=\"col\">Aprobada</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");

                    for(int i=0;i<empresas.size(); i++){
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(empresas.get(i).getIdEmpresa());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(empresas.get(i).getNombre());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(empresas.get(i).getLactitud());
                        out.println("</td>");
                       
                        out.println("<td>");
                        out.println(empresas.get(i).getLongitud());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(empresas.get(i).getEmail());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(empresas.get(i).getTelefono());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(empresas.get(i).getDescripcion());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(empresas.get(i).getAprobada());
                        out.println("</td>");
                        
                        out.println("</tr>");
                        
                        
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
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
