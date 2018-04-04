<%-- 
    Document   : registrarEmpresa
    Created on : 03/04/2018, 11:01:10 PM
    Author     : demc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            <form method="post" action="Empresaadd">
                <table>
                    <tr>
                        <td>Usuario</td>   
                        <td><input type="text" name="usuario"/></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>   
                        <td><input type="text" name="nombre"/></td>
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
                        <td>Email</td>   
                        <td><input type="text" name="email"/></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>   
                        <td><input type="text" name="telefono"/></td>
                    </tr>
                    <tr>
                        <td>Descripcion</td>   
                        <td><input type="text" name="descripcion"/></td>
                    </tr>
                    <tr>
                        <td>Aprobada</td>   
                        <td><input type="text" name="aprobada"/></td>
                    </tr>
            
                    <tr colspan="2">
                        <td><input type="submit" value="Guardar" /></td>
                    </tr>
                </table>
              
             </form>
        </div>
    </div>
    </body>
</html>
