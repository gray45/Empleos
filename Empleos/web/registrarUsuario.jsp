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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
         <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBe7lRExeChAWuRiEpRkE-l8aldatSkkAw&libraries=places"></script>
         <script src="Js/Mapa_de_usuario.js" type="text/javascript"></script>
         <script src="Js/Geolocalizacion.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/botsnip.css" />
        <link rel="stylesheet" href="css/slidr.css" type="text/css"/>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css"/>
        <script src="Js/Usuarios.js" type="text/javascript"></script>
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
                <div class="col-md-9" id="content">

                    <div class="container">
                        <div class="row main">
                            <div class="main-login main-center">
                                <h2>Agregar Usuario.</h2>
                                <form class="" method="post" action="javascript:add()" id="formulario">

                                    <div class="form-group">
                                        <label for="username" class="cols-sm-2 control-label">Nombre de Usuario</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="username" id="username"  placeholder="Nombre de usuario"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" >
                                        <label for="password" class="cols-sm-2 control-label">Password</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-key fa" aria-hidden="true"></i></span>
                                                <input type="password" class="form-control" name="password" id="password"  placeholder="Password"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="tipo" class="cols-sm-2 control-label">Tipo de Usuario</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-clipboard fa" aria-hidden="true"></i></span>
                                                <select class="form-control" name="tipo" id="tipo"  onchange="mostrarCampos()">
                                                    <option value="1">Administrador</option>
                                                    <option value="2">Empresa</option>
                                                    <option value="3">Oferente</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divNombre">
                                        <label for="nombre" class="cols-sm-2 control-label">Nombre</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="nombre" id="nombre"  placeholder="Nombre"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" style="display: none" id="divCedula">
                                        <label for="cedula" class="cols-sm-2 control-label">Cedula</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-slideshare fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="cedula" id="cedula"  placeholder="Cedula"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divPrimerApe">
                                        <label for="primerApellido" class="cols-sm-2 control-label">Primer Apellido</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="primerApellido" id="primerApellido"  placeholder="Primer Apellido"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divLactitud">
                                        <label for="lactitud" class="cols-sm-2 control-label">Lactitud</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-map-marker  fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="lactitud" id="lactitud"  placeholder="Lactitud"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divlongitud">
                                        <label for="longitud" class="cols-sm-2 control-label">Longitud</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-map-marker  fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="longitud" id="longitud"  placeholder="Longitud"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divEmail">
                                        <label for="email" class="cols-sm-2 control-label">Email</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="email" id="email"  placeholder="Email"/>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="form-group" style="display: none" id="divTelefono">
                                        <label for="telefono" class="cols-sm-2 control-label">Telefono</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-phone fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="telefono" id="telefono"  placeholder="Telefono"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divDescripcion">
                                        <label for="descripcion" class="cols-sm-2 control-label">Descripcion</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-font fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="descripcion" id="descripcion"  placeholder="Descripcion de la Empresa"/>
                                            </div>
                                        </div>
                                    </div> 

                                    <div class="form-group" style="display: none" id="divAprobado">
                                        <label for="aprobado" class="cols-sm-2 control-label">Aprobado</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-check fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="aprobado" id="aprobado"  placeholder="1=Si 2=No"/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group" style="display: none" id="divNacionalidad">
                                        <label for="nacionalidad" class="cols-sm-2 control-label">Nacionalidad</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-globe fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="nacionalidad" id="nacionalidad"  placeholder="Nacionalidad"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" style="display: none" id="divDireccion">
                                        <label for="inputDireccion">Dirección*</label>    
                                        <div class="input-group">                                               
                                            <input type="text" class="form-control" id="inputDireccion" autofocus="autofocus" placeholder="Presione el botón → " size="100%" 
                                                   >
                                            <span id="Obtener_ubicacion" class=" input-group-addon">
                                                <span class="active glyphicon glyphicon-screenshot" onclick="Obtener_ubicacion( )"></span>
                                            </span>
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
                <div id="Mapa_de_usuario"></div>
    </body>
</html>
