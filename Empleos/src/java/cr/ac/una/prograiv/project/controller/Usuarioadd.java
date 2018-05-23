/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import cr.ac.una.prograiv.project.Dao.UsuarioDao;
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
@WebServlet(name = "Usuarioadd", urlPatterns = {"/Usuarioadd"})
public class Usuarioadd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String tipo=request.getParameter("tipo");
            Usuario user=new Usuario();
            user.setUserName(username);
            user.setPassword(password);
            user.setTipo(tipo);
            UsuarioDao dao=new UsuarioDao();
            dao.save(user);
        
            response.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out= response.getWriter()){
                System.out.println("Se guardo el Usuario");
                response.sendRedirect("index.jsp");
            }
        
    }

   
}
