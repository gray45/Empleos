/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.project.controller;

import com.google.gson.Gson;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;

import cr.ac.una.prograiv.project.bl.Pago;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Escinf
 */
@WebServlet(name = "ServletPago", urlPatterns = {"/ServletPago"})
public class ServletPago extends HttpServlet {

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
        String clientId = "AYEcykzIm_hgrMFaMjt2CmpdLNJBd7EONojMmd7lk1yaysnF3uGIJ-r0c7puWe0JFCVMw25jMmJ0upuH";
        String clientSecret = "EJavZShQ2NnZ0UtOLHE_qmWdx_x1iyCw-SYwOLO6al6pBj9DRN2laCNsE2YGKiVxAggGrLFLQYsXJyf1";        
      try{
        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        Pago pago = gson.fromJson(reader, Pago.class);
        
        Payment payment = new Payment();
        payment.setId(pago.getPaymentID());
        APIContext apiContext = new APIContext(clientId, clientSecret, "sandbox");
        PaymentExecution paymentExecution = new PaymentExecution();
        paymentExecution.setPayerId(pago.getPayerID());
        Payment createdPayment = payment.execute(apiContext, paymentExecution);
        Transaction t = createdPayment.getTransactions().get(0);
        if(!t.getAmount().getTotal().equals("10.00")) throw new Exception("Pago incorrecto");
        Pago resultado = new Pago();
        resultado.setPaymentID(createdPayment.getId());



        PrintWriter out = response.getWriter();
        response.setContentType("application/json; charset=UTF-8");
        out.write(gson.toJson(pago));        
        response.setStatus(200); // ok with content
      }
      catch(Exception e){	
        response.setStatus(401); //Bad request
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
