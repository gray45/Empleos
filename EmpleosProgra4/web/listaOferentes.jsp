<%-- 
    Document   : listaOferentes
    Created on : 03/04/2018, 10:26:04 PM
    Author     : demc0
--%>

<%@page import="cr.ac.una.prograiv.project.domain.Oferente"%>
<%@page import="java.util.List"%>
<%@page import="cr.ac.una.prograiv.project.Dao.OferenteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/css.css" />
        <link rel="stylesheet" href="css/slidr.css" type="text/css"/>
    </head>
    <body>
        <div id="wrapper">
        <div id="header">
            <p>This is the Header</p>
        </div>
        <div id="leftcolumn">
            <%@include file="menu.jspf" %>
        </div>
        <div id="content">
            <%
                List<Oferente> ofer;
                OferenteDao da=new OferenteDao();
                ofer=da.findAll();
            %>
            <table>
                <tr>
                    <td>ID</td>
                    <td>Nombre</td>
                    <td>Cedula</td>
                    <td>Nacionalidad</td>
                    <td>telefono</td>
                    <td>email</td>
                    <td>Latitud</td>
                    <td>Longitud</td>
                    <td>Contratado</td>
                    
                </tr>
                <%
                    for(int i=0; i<ofer.size();i++){
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(ofer.get(i).getIdOferente());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getNombre()+" "+ofer.get(i).getPrimerApellido());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getCedula());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getNacionalidad());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getTelefono());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getEmail());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getLactitud());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(ofer.get(i).getLongitud());
                        out.println("</td>");
                        out.println("<td>");
                        if(ofer.get(i).getContratado()==1){out.println("Si");}else{out.println("NO");}
                        out.println("</td>");
                        out.println("</tr>");
                    }
                %>
            </table>
        </div>
    </div>
    </body>
</html>
