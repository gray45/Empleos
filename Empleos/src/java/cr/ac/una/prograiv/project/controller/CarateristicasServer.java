/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import cr.ac.una.prograiv.project.bl.CaracteristicasBl;
import cr.ac.una.prograiv.project.bl.EmpresaBl;
import cr.ac.una.prograiv.project.domain.Carateristicas;
import cr.ac.una.prograiv.project.domain.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
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
@WebServlet(name = "CarateristicasServer", urlPatterns = {"/CarateristicasServer"})
public class CarateristicasServer extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String json;
            CaracteristicasBl caractBl = new CaracteristicasBl();
            List<Carateristicas> caract = null;
            HttpSession s = request.getSession(true);
            String accion = request.getParameter("accion");
            switch (accion) {
                case "todas":
                    caract = caractBl.findAll();
                    json = new Gson().toJson(caract);

                    // response.setContentType("application/json; charset=UTF-8");
                    out.print(json);
                    // response.setStatus(200);
                    break;

                case "hijos":
                    String query = "FROM Carateristicas  WHERE padre =" + "'" + request.getParameter("padre") + "'";
                    caract = caractBl.findByQuery(query);
                    json = new Gson().toJson(caract);

                    // response.setContentType("application/json; charset=UTF-8");
                    out.print(json);
                    // response.setStatus(200);
                    break;

                case "criterio":
                    String crit = request.getParameter("criterio");

                    Gson gson = new Gson();
                    JsonParser jsonParser = new JsonParser();
                    JsonArray jsonArray = (JsonArray) jsonParser.parse(crit);
                    LinkedList<String> array = new LinkedList<>();
                    for (int i = 0; i < jsonArray.size(); i++) {
                        JsonElement x = jsonArray.get(i);
                        array.add(x.getAsString());
                    }

                    String ids = "( cara.carateristicas = " + array.get(0);
                    for (int i = 1; i < 2; i++) {
                        ids = ids + " or cara.carateristicas = " + array.get(i);
                    }
                    ids = ids + " )";

                    EmpresaBl empresaBl = new EmpresaBl();
                    List<Empresa> empresas;

                    String consulta = "select empresa\n"
                            + "from  Carateristicaspuesto cara, Empresa empresa ,Empresa puesto\n"
                            + "where cara.id = puesto.idEmpresa and puesto.idEmpresa = empresa.idEmpresa and " + ids;

                    empresas = empresaBl.findByQueryLimit(consulta, 10);

                    json = new Gson().toJson(empresas);
                    out.print(json);
                    // response.setStatus(200);
                    break;

                default:
                    out.print("E~No se indico la acción que se desea realizar");
                    break;
            }
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
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
