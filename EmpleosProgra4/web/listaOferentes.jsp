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
                    <div class="col-md-6"><h2 align="center">LISTA DE OFERENTES</h2></div>
                    <div class="col-md-3"></div>
                </div>
                <%
                List<Oferente> ofer;
                OferenteDao da=new OferenteDao();
                ofer=da.findAll();
            %>
            <table class="table table-striped">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Cedula</th>
                    <th scope="col">Nacionalidad</th>
                    <th scope="col">telefono</th>
                    <th scope="col">email</th>
                    <th scope="col">Latitud</th>
                    <th scope="col">Longitud</th>
                    <th scope="col">Contratado</th>
                    
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
        
        </div>
        
        
        
        
        
    </body>
</html>
