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
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/botsnip.css" />
<link rel="stylesheet" href="css/slidr.css" type="text/css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="css/header.css"/>
</head>
<body>
    <div id="wrapper">
        <div class="col-md-12" id="header1">
            <%@include file="header.jspf" %>
        </div>
        <div class="col-md-12 divprin">
            <div class="col-md-3" id="leftcolumn">
                <%@include file="menu.jspf" %>
            </div>
            <div class="col-md-8" id="content">
                <div class="row main">
				<div class="main-login main-center">
				<h2>LOGIN</h2>
					<form class="" method="post" action="Login">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Nombre de Usuario</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="username" id="name"  placeholder="Nombre"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-key fa" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="email"  placeholder="Password"/>
								</div>
							</div>
						</div>
                                            
                                                

						<div class="form-group" >
                                                        <input class="btn btn-primary btn-lg btn-block login-button" type="submit" value="Ingresar" />
						</div>
						
					</form>
				</div>
			</div>
            </div>
            
        </div>
        
    </div>
            
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
</body>
</html>
