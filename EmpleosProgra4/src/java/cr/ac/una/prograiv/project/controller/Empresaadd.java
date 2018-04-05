/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import cr.ac.una.prograiv.project.Dao.EmpresaDao;
import cr.ac.una.prograiv.project.domain.Empresa;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author demc0
 */
@WebServlet(name = "Empresaadd", urlPatterns = {"/Empresaadd"})
public class Empresaadd extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int e=Integer.parseInt(request.getParameter("usuario"));
            Usuario user=new Usuario();
            user.setIdUsuario(e);
            String nombre=request.getParameter("nombre");
            String lactitud=request.getParameter("lactitud");
            String longitud=request.getParameter("longitud");
            String email=request.getParameter("email");
            String telefono=request.getParameter("telefono");
            String descripcion=request.getParameter("descripcion");
            String aprobada=request.getParameter("aprobado");
            Empresa em=new Empresa();
            em.setUsuario(user);
            em.setNombre(nombre);
            em.setLactitud(lactitud);
            em.setLongitud(longitud);
            em.setEmail(email);
            em.setTelefono(telefono);
            em.setDescripcion(descripcion);
            em.setAprobada(aprobada);
            EmpresaDao dao=new EmpresaDao();
            dao.save(em);
            
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out= response.getWriter()){
                System.out.println("Se guardo la empresa");
                response.sendRedirect("index.jsp");
            }
            
    }

  
}
