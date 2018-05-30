<%-- 
    Document   : listaEmpresas
    Created on : 03/04/2018, 11:19:49 PM
    Author     : demc0
--%>

<%@page import="cr.ac.una.prograiv.project.Dao.EmpresaDao"%>
<%@page import="cr.ac.una.prograiv.project.domain.Empresa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/botsnip.css" />
        <link rel="stylesheet" href="css/slidr.css" type="text/css"/>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        <title>Lista de Empresas</title>
    </head>
    <body>
        <div id="wrapper">
        <div class="col-md-12" id="header1">
            <%@include file="header.jspf" %>
        </div>
        <div class="col-lg-12 divprin">
            <div class="col-md-3" id="leftcolumn">
                <%@include file="menu.jspf" %>
            </div>
            <div class="col-md-8" id="content">
                
                <div class="col-md-12">
                    <div class="col-md-3"></div>
                    <div class="col-md-6"><h2 align="center">LISTA DE EMPRESAS</h2></div>
                    <div class="col-md-3"></div>
                </div>
               <% 
                List<Empresa> empresas;
                EmpresaDao da=new EmpresaDao();
                empresas=da.findAll();
            %>
            <table class="table table-striped">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Latitud</th>
                    <th scope="col">Longitud</th>
                    <th scope="col">Email</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">Descripcion</th>
                    <th scope="col">Aprobada</th>
                    
                </tr>
                <%
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
                %>
            </table>
            </div>
            
        </div>
        
    </div>
        
        
        
      
    </body>
</html>
