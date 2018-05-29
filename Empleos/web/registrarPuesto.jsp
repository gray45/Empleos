<%-- 
    Document   : registrarPuesto
    Created on : 28/05/2018, 06:37:04 PM
    Author     : demc0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
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
                                <h2>Registrar Puestos</h2>
                                <form class="" method="post" action="registrarPuesto">
                                    <div class="form-group">
                                        
                                            
                                        
                                        <label for="descripcion" class="cols-sm-2 control-label">Descripcion</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                <input type="text" class="form-control" name="descripcion" id="descripcion"  placeholder="Descripcion"/>
                                            </div>
                                        </div>
                                   
                              
                                        <label for="tipo" class="cols-sm-2 control-label">Tipo</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-key fa" aria-hidden="true"></i></span>
                                                <input type="tipo" class="form-control" name="tipo" id="tipo"  placeholder="tipo"/>
                                            </div>
                                        </div>
                                        
                                        <label for="sueldo" class="cols-sm-2 control-label">Sueldo</label>
                                        <div class="cols-sm-5">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-key fa" aria-hidden="true"></i></span>
                                                <input type="sueldo" class="form-control" name="sueldo" id="sueldo"  placeholder="sueldo"/>
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
        
    

