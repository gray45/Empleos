<%-- 
    Document   : registrarOferente
    Created on : 02/04/2018, 09:25:27 PM
    Author     : demc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Oferente</title> 
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/botsnip.css" />
<link rel="stylesheet" href="css/slidr.css" type="text/css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css"/>

        
        
    </head>
    <body>
        
        <div id="wrapper">
        <div class="col-md-12" id="header1">
            <%@include file="header.jspf" %>
        </div>
        <div class="col-lg-12 divprin">
            <div class="col-md-3" id="leftcolumn">
                <%@include file="menu.jspf" %>
            </div>
            <div class="col-md-8" id="content">
                
                <div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h2>Agregar Oferente.</h2>
					<form class="" method="post" action="Oferenteadd">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Cedula</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-slideshare fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="cedula" id="cedula"  placeholder="Cedula"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Nombre</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="nombre" id="nombre"  placeholder="Nombre"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Primer Apellido</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="primerApellido" id="primerApellido"  placeholder="Primer Apellido"/>
								</div>
							</div>
						</div>
                                                
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Nacionalidad</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-globe fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="nacionalidad" id="nacionalidad"  placeholder="Nacionalidad"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Telefono</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-phone fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="telefono" id="telefono"  placeholder="Telefono"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Email</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  placeholder="Email"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Latitud</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-map-marker fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="lactitud" id="latitud"  placeholder="Latitud"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Longitud</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-map-marker fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="longitud" id="longitud"  placeholder="Longitud"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Contratado</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-check fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="contratado" id="contratado"  placeholder="1=Si 2=No"/>
								</div>
							</div>
						</div>
                                            
                                                <div class="form-group">
							<label for="tipo" class="cols-sm-2 control-label">Usuario ID</label>
							<div class="cols-sm-5">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-question-circle fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="usuario" id="usuario"  placeholder="Id del Usuario"/>
								</div>
							</div>
						</div>

						<div class="form-group" >
                                                        <input class="btn btn-primary btn-lg btn-block login-button" type="submit" value="Guardar" />
						</div>
						
					</form>
				</div>
			</div>
		</div>

		 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
                
            </div>
            
        </div>
        
        </div>
        
        
    
   
</html>
