/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.simplecookieapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SearchEnginesServlet
 * http://pastebin.com/5jT2K2PQ
 * ServletUtilities
 * http://pastebin.com/BXw8QrLH
 * @author Omar
 */
public class SearchEnginesServlet extends HttpServlet {

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
        Cookie[] cookies = request.getCookies();
        String searchString
                = ServletUtilities.getCookieValue(cookies,
                        "searchString",
                        "Java Programming");
        String numResults
                = ServletUtilities.getCookieValue(cookies,
                        "numResults",
                        "10");
        String searchEngine
                = ServletUtilities.getCookieValue(cookies,
                        "searchEngine",
                        "google");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Searching the Web";
        out.println(ServletUtilities.headWithTitle(title)
                + "<BODY BGCOLOR=\"#FDF5E6\">\n"
                + "<H1 ALIGN=\"CENTER\">Searching the Web</H1>\n"
                + "\n"
                + "<FORM ACTION=\"/SimpleCookieApp/searchEngines\">\n"
                + "<CENTER>\n"
                + "Search String:\n"
                + "<INPUT TYPE=\"TEXT\" NAME=\"searchString\"\n"
                + "       VALUE=\"" + searchString + "\"><BR>\n"
                + "Results to Show Per Page:\n"
                + "<INPUT TYPE=\"TEXT\" NAME=\"numResults\"\n"
                + "       VALUE=" + numResults + " SIZE=3><BR>\n"
                + "<INPUT TYPE=\"RADIO\" NAME=\"searchEngine\"\n"
                + "       VALUE=\"google\""
                + checked("google", searchEngine) + ">\n"
                + "Google |\n"
                + "<INPUT TYPE=\"RADIO\" NAME=\"searchEngine\"\n"
                + "       VALUE=\"infoseek\""
                + checked("infoseek", searchEngine) + ">\n"
                + "Infoseek |\n"
                + "<INPUT TYPE=\"RADIO\" NAME=\"searchEngine\"\n"
                + "       VALUE=\"lycos\""
                + checked("lycos", searchEngine) + ">\n"
                + "Lycos |\n"
                + "<INPUT TYPE=\"RADIO\" NAME=\"searchEngine\"\n"
                + "       VALUE=\"hotbot\""
                + checked("hotbot", searchEngine) + ">\n"
                + "HotBot\n"
                + "<BR>\n"
                + "<INPUT TYPE=\"SUBMIT\" VALUE=\"Search\">\n"
                + "</CENTER>\n"
                + "</FORM>\n"
                + "\n"
                + "</BODY>\n"
                + "</HTML>\n");
    }

    private String checked(String name1, String name2) {
        if (name1.equals(name2)) {
            return (" CHECKED");
        } else {
            return ("");
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
