<%-- 
    Document   : listaUsuarios
    Created on : 03/04/2018, 11:45:28 PM
    Author     : demc0
--%>

<%@page import="java.util.List"%>
<%@page import="cr.ac.una.prograiv.project.Dao.UsuarioDao"%>
<%@page import="cr.ac.una.prograiv.project.domain.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Usuarios</title>
        <link rel="stylesheet" type="text/css" href="css/css.css" />
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
                List<Usuario> user;
                UsuarioDao da=new UsuarioDao();
                user=da.findAll();
            %>
            <table>
                <tr>
                    <td>ID</td>
                    <td>UserName</td>
                    <td>Password</td>
                    <td>Tipo</td>
                    
                    
                </tr>
                <%
                    for(int i=0; i<user.size();i++){
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(user.get(i).getIdUsuario());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(user.get(i).getUserName());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(user.get(i).getPassword());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(user.get(i).getTipo());
                        out.println("</td>");
                        
                        
                        out.println("</tr>");
                    }
                %>
            </table>
        </div>
    </div>
    </body>
</html>
