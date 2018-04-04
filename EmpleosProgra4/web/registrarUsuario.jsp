<%-- 
    Document   : registrarUsuario
    Created on : 03/04/2018, 11:36:42 PM
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
            <form method="post" action="Usuarioadd">
            <table>
            <tr>
                  <td>Username</td>   
                  <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                  <td>Password</td>   
                  <td><input type="text" name="password"/></td>
            </tr>
            <tr>
                  <td>Tipo</td>   
                  <td><input type="text" name="tipo"/></td>
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
