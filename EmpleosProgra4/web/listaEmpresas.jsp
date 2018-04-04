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
        <link rel="stylesheet" type="text/css" href="css/css.css" />
        <title>Lista de Empresas</title>
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
                List<Empresa> empresas;
                EmpresaDao da=new EmpresaDao();
                empresas=da.findAll();
            %>
            <table>
                <tr>
                    <td>ID</td>
                    <td>Nombre</td>
                    <td>Latitud</td>
                    <td>Longitud</td>
                    <td>Email</td>
                    <td>Telefono</td>
                    <td>Descripcion</td>
                    <td>Aprobada</td>
                    
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
    </body>
</html>
