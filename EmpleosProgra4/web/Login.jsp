<%-- 
    Document   : Login
    Created on : 03/04/2018, 03:11:14 PM
    Author     : Ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Empleos</title>
  <link href="css/style.css" rel="stylesheet" type="text/css"/>  
</head>
<body>
    <div> <img  src="Imagen/Empleo.jpg"> </div>
    <div class="area" style="width:30%">   
       <form action="Login" method="post">
           <input class="formfield" type="text" name="username" placeholder="username" required><br>
           <input class="formfield" type="password" name="password" placeholder="password" required><br>
           <input class="formfield"  type="submit" value="Ingresar">
       </form>
   </div>
</body>
</html>
