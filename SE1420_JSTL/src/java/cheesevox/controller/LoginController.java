/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheesevox.controller;

import cheeesevox.daos.RegistractionDAO;
import cheeesevox.dto.RegistractionErrorObject;
import cheeesevox.model.TriBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cheeese vox
 */
public class LoginController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String ADMIN = "test.jsp";
    private static final String USER = "user.jsp";
    private static final String INVALID = "index.jsp";

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
        String url = ERROR;
        try {
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");

            boolean valid = true;
            RegistractionErrorObject errorObj = new RegistractionErrorObject();
            if (username.length() == 0) {
                errorObj.setPasswordError("username can't be blank");
                valid = false;
            }
            if (password.length() == 0) {
                errorObj.setPasswordError("password can't be blank");
                valid = false;
            }
            if (valid) {
                TriBean beans = new TriBean();
                beans.setUsername(username);
                beans.setPassword(password);
                String role = beans.checkLogin();
                if (role.equals("failed")) {
                    request.setAttribute("ERROR", "ERROR at LoginController");
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("USERNAME", username);
                    session.setAttribute("ROLE", role);
                    
                    if (role.equals("admin")) 
                        url = ADMIN;
                     else if (role.equals("user")) 
                        url = USER;
                     else 
                         request.setAttribute("ERROR", "Your Role IS INVALID");
                    
                }
            } else {
                url = INVALID;
                request.setAttribute("INVALID", errorObj);
            }

        } catch (Exception e) {
            log("Error at LoginConller: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
