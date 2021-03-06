/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import cr.ac.una.prograiv.project.bl.UsuarioBl;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ismael
 */
@WebServlet(name = "Login", urlPatterns = {"/Login", "/Logout"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        switch (request.getServletPath()) {
            case "/Logout":
                this.doLogout(request, response);
                break;
            case "/Login":
                this.doLogin(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void doLogin(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        HttpSession s = request.getSession(true);
//<editor-fold defaultstate="collapsed" desc="...">
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Usuario usuario = null;
        Usuario usuaux = new Usuario();

//usuario.setUserName(username);
//usuario.setPassword(password);
        UsuarioBl usu = new UsuarioBl();

        List<Usuario> usuarios = usu.findByQuery("FROM Usuario WHERE userName=" + "'" + username + "'" + "AND" + " password=" + "'" + password + "'");
        if (!usuarios.isEmpty()) {
            usuaux = (Usuario) usuarios.get(0);
            s.setAttribute("usuario", usuaux);
        }
        if (usuaux.getUserName() != null) {

            //request.getRequestDispatcher("registrarOferente.jsp").forward( request, response);
            // response.sendRedirect("Slider");
            request.getRequestDispatcher("Slider").
                    forward(request, response);

        } else {
            s.setAttribute("usuario", usuario);
            //request.getRequestDispatcher("Usuarios.jsp").forward( request, response);
            request.setAttribute("error", "Credenciales incorrectas..");
            request.getRequestDispatcher("Error.jsp").
                    //response.sendRedirect(""Error.jsp");
                    forward(request, response);

        }

    }

    protected void doLogout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().invalidate();
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

}
