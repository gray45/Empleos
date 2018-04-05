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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/botsnip.css" />
<link rel="stylesheet" href="css/slidr.css" type="text/css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">

    </head>
    <body>
        <div id="wrapper">
        <div class="col-md-12" id="header1">
            <%@include file="header.jspf" %>
        </div>
        <div class="col-lg-12">
            <div class="col-md-3" id="leftcolumn">
                <%@include file="menu.jspf" %>
            </div>
            <div class="col-md-8" id="content">
                <div class="col-md-12">
                    <div class="col-md-3"></div>
                    <div class="col-md-6"><h2 align="center">LISTA DE USUARIOS</h2></div>
                    <div class="col-md-3"></div>
                </div>
                <%
                List<Usuario> users;
                UsuarioDao da=new UsuarioDao();
                users=da.findAll();
            %>
            <table class="table table-striped">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">UserName</th>
                    <th scope="col">Password</th>
                    <th scope="col">Tipo</th>
                    
                    
                </tr>
                <%
                    for(int i=0; i<users.size();i++){
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(users.get(i).getIdUsuario());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(users.get(i).getUserName());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(users.get(i).getPassword());
                        out.println("</td>");
                        out.println("<td>");
                        out.println(users.get(i).getTipo());
                        out.println("</td>");
                        
                        
                        out.println("</tr>");
                    }
                %>
            </table>
            </div>
            
        </div>
        
    </div>
      
    </body>
</html>
