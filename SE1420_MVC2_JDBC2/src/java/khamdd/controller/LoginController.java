/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import khamdd.models.RegistrationDAO;

/**
 *
 * @author KHAM
 */
public class LoginController extends HttpServlet {

    private static final String ERROR = "Scriptlet/error.jsp";
    private static final String ADMIN = "Scriptlet/admin.jsp";
    private static final String USER = "Scriptlet/user.jsp";

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
            //1.Nhan request tu 1 client 
            String username = request.getParameter("txtUsername");
            //2.Request get parameter lay du lieu tu 3 vi tri: hyperlink hoac url, nam o tren form khi nguoi dung nhan submit, trong the param
            String password = request.getParameter("txtPassword");
            //3. Goi model
            RegistrationDAO dao = new RegistrationDAO();
            String role = dao.checkLogin(username, password);
            //4.Dieu huong va chuyen trang (Mang ket qua xu ly cua model den view tuong ung
//            System.out.println("Role = " +role);
            if (role.equals("failed")) {
                request.setAttribute("ERROR", "Invalid username or password");
//                response.sendRedirect("ErrorServlet");
            } else if (role.equals("admin")) {
                url = ADMIN;
//                    response.sendRedirect("AdminServlet");
            } else if (role.equals("user")) {
                url = USER;
//                    response.sendRedirect("UserServlet");
//                } else response.sendRedirect("ErrorServlet");
            } else {
                request.setAttribute("ERROR", "Your role is invalid");
            }

        } catch (Exception e) {
            log("error at login controller " +e.getMessage());
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
