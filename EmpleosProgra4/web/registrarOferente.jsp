<%-- 
    Document   : registrarOferente
    Created on : 02/04/2018, 09:25:27 PM
    Author     : demc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cr.ac.una.prograiv.project.controller.OferenteServlet"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
        
    </head>
    <body>
        <form method="post" action="Oferenteadd">
            <table>
            <tr>
                  <td>Cedula</td>   
                  <td><input type="text" name="cedula"/></td>
            </tr>
            <tr>
                  <td>Nombre</td>   
                  <td><input type="text" name="nombre"/></td>
            </tr>
            <tr>
                  <td>Primer Apellido</td>   
                  <td><input type="text" name="primerApellido"/></td>
            </tr>
            <tr>
                  <td>Nacionalidad</td>   
                  <td><input type="text" name="nacionalidad"/></td>
            </tr>
            <tr>
                  <td>Telefono</td>   
                  <td><input type="text" name="telefono"/></td>
            </tr>
            <tr>
                  <td>Email</td>   
                  <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                  <td>Latitud</td>   
                  <td><input type="text" name="lactitud"/></td>
            </tr>
            <tr>
                  <td>Longitud</td>   
                  <td><input type="text" name="longitud"/></td>
            </tr>
            <tr>
                  <td>Contratado</td>   
                  <td><input type="text" name="contratado"/></td>
            </tr>
            <tr>
                  <td>Usuario</td>   
                  <td><input type="text" name="usuario"/></td>
            </tr>
            <tr colspan="2">
                <td><input type="submit" value="Guardar" /></td>
            </tr>
           
            
            </table>
            
        </form>
    </body>
</html>
