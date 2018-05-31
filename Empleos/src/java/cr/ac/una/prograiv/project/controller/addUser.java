/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import cr.ac.una.prograiv.project.controller.*;
import cr.ac.una.prograiv.project.Dao.EmpresaDao;
import cr.ac.una.prograiv.project.Dao.OferenteDao;
import cr.ac.una.prograiv.project.Dao.UsuarioDao;
import cr.ac.una.prograiv.project.domain.Empresa;
import cr.ac.una.prograiv.project.domain.Oferente;
import cr.ac.una.prograiv.project.domain.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author grave
 */
@WebServlet(name = "addUser", urlPatterns = {"/addUser"})
public class addUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            HttpSession s = request.getSession(true);

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String tipo = request.getParameter("tipo");       
            String nombre = request.getParameter("nombre");
            String cedula = request.getParameter("cedula");
            String primerApe = request.getParameter("primerApellido");
            String lactitud = request.getParameter("lactitud");
            String longitud = request.getParameter("longitud");
            String telefono = request.getParameter("telefono");
            String email = request.getParameter("email");
            String descripcion = request.getParameter("descripcion");
            String aprobado = request.getParameter("aprobado");
            String nacionalidad = request.getParameter("nacionalidad");
            String direccion = request.getParameter("direccion");
            
            
            Usuario user = new Usuario(username, password, tipo);
            UsuarioDao usuDao = new UsuarioDao();
            usuDao.save(user);
            Usuario user2 = (Usuario) usuDao.findByQuery("FROM Usuario WHERE userName=" + "'" + username + "'" + "AND" + " password=" + "'" + password + "'").get(0);
            s.setAttribute("usuario", user2);   
            switch (tipo) {
                case "1":
                     response.setStatus(200);
                    request.getRequestDispatcher("Slider").forward(request, response);
                    break;

                case "2":
                    
                    Empresa empresa = new Empresa(user2,nombre,lactitud,longitud,email,telefono,descripcion,aprobado);
                   empresa.setDireccion(direccion);
                    EmpresaDao empresaDao = new EmpresaDao();
                   empresaDao.save(empresa);
                   response.setStatus(200);
                    request.getRequestDispatcher("Slider").forward(request, response);
                    
                    break;
                    
                case "3":
                    
                    Oferente oferente = new Oferente(user2, cedula, nombre, primerApe, nacionalidad, telefono, email, lactitud, longitud, Integer.parseInt(aprobado));
                    oferente.setDireccion(direccion);
                    OferenteDao oferenteDao = new OferenteDao();
                    oferenteDao.save(oferente);
                    request.getRequestDispatcher("Slider").forward(request, response);
                    break;
                    
                    default:
                    out.print("E~No se indico la acción que se desea realizar");
                    break;
            }

        } catch (Exception e) {
             response.setStatus(401);
            String error = e.getMessage();
            request.setAttribute("error", error);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
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

}
