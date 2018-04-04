<%-- 
    Document   : Error
    Created on : 03/04/2018, 11:57:23 PM
    Author     : grave
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="Header.jsp" %>
    
  <div id="body" style="margin: 0 auto; width:85%; ">    
    <jsp:useBean id="error" scope="request" type="java.lang.String" class="java.lang.String" />
    <div class="area" style="width:70%">   
        <div style="color:red; font-size: 30px;"> <%=error%></div>
        <div style="color:red; font-size: 30px;"> Intente <a href="Login.jsp"> ingresar</a> de nuevo</div>
   </div>
  </div>
    </body>
</html>
