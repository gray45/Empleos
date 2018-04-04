<%-- 
    Document   : index
    Created on : 03/04/2018, 08:56:33 PM
    Author     : demc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<title>Inicio</title>
<!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<link rel="stylesheet" type="text/css" href="css/css.css" />
<link rel="stylesheet" href="css/slidr.css" type="text/css"/>
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
            <%@ include file="slidr.jspf" %>
        </div>
    </div>
</body>
</html>
>
