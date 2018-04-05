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
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/botsnip.css" />
<link rel="stylesheet" href="css/slidr.css" type="text/css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">

</head>
<body>
    <div id="wrapper">
        <div class="col-md-12" id="header">
            <p>This is the Header</p>
        </div>
        <div class="col-md-12">
            <div class="col-md-3" id="leftcolumn">
                <%@include file="menu.jspf" %>
            </div>
            <div class="col-md-8" id="content">
                <%@ include file="slidr.jspf" %>
            </div>
            
        </div>
        
    </div>
</body>
</html>

