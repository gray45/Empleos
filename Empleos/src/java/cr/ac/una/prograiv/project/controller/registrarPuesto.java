/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import cr.ac.una.prograiv.project.bl.EmpresaBl;
import cr.ac.una.prograiv.project.bl.PuestoBl;
import cr.ac.una.prograiv.project.domain.Empresa;
import cr.ac.una.prograiv.project.domain.Puesto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cr.ac.una.prograiv.project.domain.Usuario;

/**
 *
 * @author demc0
 */
@WebServlet(name = "registrarPuesto", urlPatterns = {"/registrarPuesto"})
public class registrarPuesto extends HttpServlet {

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
        try{
            HttpSession s= request.getSession(true);
            Usuario us=new Usuario();
            us=(Usuario)s.getAttribute("usuario");
            String desc= request.getParameter("descripcion");
            String tipo= request.getParameter("tipo");
            String suel= request.getParameter("sueldo");
            int idem= us.getIdUsuario();
            
            EmpresaBl b=new EmpresaBl();
            
            Empresa e=new Empresa();
            e=b.findByQuery("From Empresa Where Usuario_idUsuario ='"+idem+"'").get(0);
            
            Puesto p=new Puesto(e, desc, suel, tipo,1);
            PuestoBl pbl=new PuestoBl();
            pbl.save(p);
            
            request.getRequestDispatcher("Slider").forward(request, response);
            
        }catch(Exception e){
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
