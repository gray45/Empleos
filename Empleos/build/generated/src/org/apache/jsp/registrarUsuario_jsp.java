package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cr.ac.una.prograiv.project.domain.Usuario;
import cr.ac.una.prograiv.project.domain.Usuario;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("         <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBe7lRExeChAWuRiEpRkE-l8aldatSkkAw&libraries=places\"></script>\n");
      out.write("         <script src=\"Js/Mapa_de_usuario.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"Js/Geolocalizacion.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/botsnip.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slidr.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <script src=\"Js/Usuarios.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div class=\"col-md-12\" id=\"header1\">\n");
      out.write("                ");
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
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-12 divprin\">\n");
      out.write("                <div class=\"col-md-3\" id=\"leftcolumn\">\n");
      out.write("                    ");
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
      out.write("                    <ul>\n");
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
      out.write("                         <li><a class=\"nav-link dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" ><i class=\"fa fa-search\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Caracteristicas</span></a>\n");
      out.write("                             <div class=\"dropdown-menu rightMenu\" ><a ><i class=\"fa fa-search\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Caracteristicas</span></a>\n");
      out.write("                             </div>\n");
      out.write("                             </li>\n");
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
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\" id=\"content\">\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row main\">\n");
      out.write("                            <div class=\"main-login main-center\">\n");
      out.write("                                <h2>Agregar Usuario.</h2>\n");
      out.write("                                <form class=\"\" method=\"post\" action=\"javascript:add()\" id=\"formulario\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"username\" class=\"cols-sm-2 control-label\">Nombre de Usuario</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\"  placeholder=\"Nombre de usuario\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" >\n");
      out.write("                                        <label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-key fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\"  placeholder=\"Password\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"tipo\" class=\"cols-sm-2 control-label\">Tipo de Usuario</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-clipboard fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <select class=\"form-control\" name=\"tipo\" id=\"tipo\"  onchange=\"mostrarCampos()\">\n");
      out.write("                                                    <option value=\"1\">Administrador</option>\n");
      out.write("                                                    <option value=\"2\">Empresa</option>\n");
      out.write("                                                    <option value=\"3\">Oferente</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divNombre\">\n");
      out.write("                                        <label for=\"nombre\" class=\"cols-sm-2 control-label\">Nombre</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre\"  placeholder=\"Nombre\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divCedula\">\n");
      out.write("                                        <label for=\"cedula\" class=\"cols-sm-2 control-label\">Cedula</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-slideshare fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"cedula\" id=\"cedula\"  placeholder=\"Cedula\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divPrimerApe\">\n");
      out.write("                                        <label for=\"primerApellido\" class=\"cols-sm-2 control-label\">Primer Apellido</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"primerApellido\" id=\"primerApellido\"  placeholder=\"Primer Apellido\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divLactitud\">\n");
      out.write("                                        <label for=\"lactitud\" class=\"cols-sm-2 control-label\">Lactitud</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-map-marker  fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"lactitud\" id=\"lactitud\"  placeholder=\"Lactitud\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divlongitud\">\n");
      out.write("                                        <label for=\"longitud\" class=\"cols-sm-2 control-label\">Longitud</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-map-marker  fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"longitud\" id=\"longitud\"  placeholder=\"Longitud\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divEmail\">\n");
      out.write("                                        <label for=\"email\" class=\"cols-sm-2 control-label\">Email</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Email\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divTelefono\">\n");
      out.write("                                        <label for=\"telefono\" class=\"cols-sm-2 control-label\">Telefono</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-phone fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"telefono\" id=\"telefono\"  placeholder=\"Telefono\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divDescripcion\">\n");
      out.write("                                        <label for=\"descripcion\" class=\"cols-sm-2 control-label\">Descripcion</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-font fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"descripcion\" id=\"descripcion\"  placeholder=\"Descripcion de la Empresa\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div> \n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divAprobado\">\n");
      out.write("                                        <label for=\"aprobado\" class=\"cols-sm-2 control-label\">Aprobado</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-check fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"aprobado\" id=\"aprobado\"  placeholder=\"1=Si 2=No\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divNacionalidad\">\n");
      out.write("                                        <label for=\"nacionalidad\" class=\"cols-sm-2 control-label\">Nacionalidad</label>\n");
      out.write("                                        <div class=\"cols-sm-5\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-globe fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"nacionalidad\" id=\"nacionalidad\"  placeholder=\"Nacionalidad\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\" style=\"display: none\" id=\"divDireccion\">\n");
      out.write("                                        <label for=\"inputDireccion\">Dirección*</label>    \n");
      out.write("                                        <div class=\"input-group\">                                               \n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"inputDireccion\" autofocus=\"autofocus\" placeholder=\"Presione el botón → \" size=\"100%\" \n");
      out.write("                                                   >\n");
      out.write("                                            <span id=\"Obtener_ubicacion\" class=\" input-group-addon\">\n");
      out.write("                                                <span class=\"active glyphicon glyphicon-screenshot\" onclick=\"Obtener_ubicacion( )\"></span>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\" >\n");
      out.write("                                        <input class=\"btn btn-primary btn-lg btn-block login-button\" type=\"submit\" value=\"Guardar\" />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("                    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("                    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("                    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                <div id=\"Mapa_de_usuario\"></div>\n");
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
