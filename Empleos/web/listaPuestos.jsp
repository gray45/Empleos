<%-- 
    Document   : listaPuestos
    Created on : 30/05/2018, 12:47:18 PM
    Author     : demc0
--%>

<%@page import="cr.ac.una.prograiv.project.domain.Puesto"%>
<%@page import="java.util.List"%>
<%@page import="cr.ac.una.prograiv.project.bl.PuestoBl"%>
<%@page import="cr.ac.una.prograiv.project.bl.EmpresaBl"%>
<%@page import="cr.ac.una.prograiv.project.domain.Empresa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lista Puestos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/botsnip.css" />
        <link rel="stylesheet" href="css/slidr.css" type="text/css"/>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
        
    </head>
    <body>
       
        <div id="wrapper">
        <div class="col-md-12" id="header1">
            <%@include file="header.jspf" %>
        </div>
        
            <div class="col-md-3" id="leftcolumn">
                <%@include file="menu.jspf" %>
            </div>
             <% 
            Usuario us= new Usuario();
            
            us= (Usuario)session.getAttribute("usuario");
            int tipo=Integer.parseInt(us.getTipo());
            if(tipo==2){
                
                EmpresaBl embl= new EmpresaBl();
                Empresa empre=new Empresa();
                empre=embl.findByQuery("from Empresa where Usuario_idUsuario ='"+us.getIdUsuario()+"'").get(0);
                PuestoBl pbl= new PuestoBl();
                List<Puesto> puestos;
                puestos=pbl.findByQuery("from Puesto where Empresa_idEmpresa='"+empre.getIdEmpresa()+"'");
                
            %>
            <div class="col-md-8" id="content">
                <div class="col-md-12">
                    <div class="col-md-3"></div>
                    <div class="col-md-6"><h2 align="center">Lista de Puestos</h2></div>
                    <div class="col-md-3"></div>
                </div>
                &nbsp;
                <table class="table table-striped">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Descripcion</th>
                        <th scope="col">Sueldo</th>
                        <th scope="col">Tipo</th>
                        <th scope="col">Disponible</th>                  
                    </tr>
                    <%for(int i=0;i<puestos.size();i++){
                    
                    
                    %>
                    <tr>
                        <td><% out.println(puestos.get(i).getIdPuesto()); %></td>
                        <td><% out.println(puestos.get(i).getDescripcion()); %></td>
                        <td><% out.println(puestos.get(i).getSueldo()); %></td>
                        <td><% out.println(puestos.get(i).getTipo()); %></td>
                        <td><% if(puestos.get(i).getDisponible()==1){ 
                                out.println("Si");
                                }else{
                                    out.println("No");
                                } %></td>
                        
                    </tr>
                <% } %>    
                </table>
                
                
                
            </div>
            <% }else{%>
            <div class="col-md-8"><h1>NO ESTÁ AUTORIZADO</h1></div> 
        <% } %>
        
        
        </div>
        
        
        
        
        
    </body>
</html>
