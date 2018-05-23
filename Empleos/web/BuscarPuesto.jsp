<%-- 
    Document   : BuscarPuesto
    Created on : 04/04/2018, 10:10:20 AM
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
            <form>
                <input type="text" name="hola"/>
                <input type="submit" value="Caracteristica" />
            </form>
            <%
                
            %>
            
        </div>
    </body>
</html>
