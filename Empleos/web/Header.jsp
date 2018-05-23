<%-- 
    Document   : Header
    Created on : 04/04/2018, 12:01:03 AM
    Author     : grave
--%>

<%@page import="cr.ac.una.prograiv.project.domain.Usuario"%>
<% Usuario user= (Usuario) session.getAttribute("usuario");%>
<div id="header" style="width:100%; background-color: #337ab7;">
    
    
    
    <div id="menu" style="display: inline-block; vertical-align: top;">
        <ul class="menu">
            
            
            <% if (user!=null){%>
              <li><a href="#"><%=user.getUserName()%></a>
                <ul  > <li> <a href="Logout">Salir</a></li> </ul>
              </li>
            <% }%>

            <% if (user==null){%>
              <li><a href="Login.jsp">Iniciar-Sesión</a></li>
            <% }%>     
              
        </ul>
    </div>    
</div>
