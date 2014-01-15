/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.java.spring.core.web.servlet;

import com.java.spring.core.web.beans.ColorPreferences;
import com.java.spring.core.web.beans.Customer;
import com.java.spring.core.web.service.CustomerLookupService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author Omar
 */
public class CustomerServlet extends HttpServlet {

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
        ApplicationContext context = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(
                        getServletContext());
        // customer lookup service
        CustomerLookupService lookupService = 
                (CustomerLookupService) context.getBean(
                        "sampleLookupService");
        
        String id = request.getParameter("cust-id");
        String address;
        // se valida el id vacio
        if (isEmpty(id)) {
            address = "missing-id.jsp";
        } else {
            // si no esta vacio se obtiene el cliente
            Customer customer = lookupService.getCustomer(id);
            // si el cliente no se encontro
            if (customer == null) {
                // id invalido
                request.setAttribute("id", id);
                address = "invalid-id.jsp";
            } else {
                // si el cliente se encontro mostrar
                request.setAttribute("customer", customer);
                address = "show-customer.jsp";
            }
        }
        address = "/WEB-INF/jsp/" + address;
        // actualizar color preferences
        ColorPreferences colorPreferences = 
                (ColorPreferences) context.getBean("colorPreferences");
        colorPreferences.setForeground(request.getParameter("fg"));
        colorPreferences.setBackground(request.getParameter("bg"));
        // forward
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
    
    private boolean isEmpty(String value) {
        return ((value == null) || "".equals(value));
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
