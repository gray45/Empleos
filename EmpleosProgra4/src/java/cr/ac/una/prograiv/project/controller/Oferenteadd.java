/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import cr.ac.una.prograiv.project.Dao.OferenteDao;
import cr.ac.una.prograiv.project.domain.Oferente;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author demc0
 */
@WebServlet(name = "Oferenteadd", urlPatterns = {"/Oferenteadd"})
public class Oferenteadd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int usuario= Integer.parseInt(request.getParameter("usuario"));
            Usuario u=new Usuario();
            u.setIdUsuario(usuario);
            String cedula= request.getParameter("cedula");
            String nombre= request.getParameter("nombre");
            String primerApellido= request.getParameter("primerApellido");
            String nacionalidad= request.getParameter("nacionalidad");
            String telefono= request.getParameter("telefono");
            String email= request.getParameter("email");
            String lactitud= request.getParameter("lactitud");
            String longitud= request.getParameter("longitud");
            int contratado= Integer.parseInt(request.getParameter("contratado"));
            Oferente o= new Oferente();
            o.setUsuario(u);
            o.setNombre(nombre);
            o.setCedula(cedula);
            o.setPrimerApellido(primerApellido);
            o.setNacionalidad(nacionalidad);
            o.setTelefono(telefono);
            o.setEmail(email);
            o.setLactitud(lactitud);
            o.setLongitud(longitud);
            o.setContratado(contratado);
            OferenteDao dao=new OferenteDao();
            dao.save(o);
            
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out= response.getWriter()){
                response.sendRedirect("index.jsp");
            }
    }

    
}
