/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.daos.UserDAO;
import sample.dtos.UserDTO;
import sample.dtos.UserError;

/**
 *
 * @author admin
 */
@WebServlet(name = "CreateController", urlPatterns = {"/CreateController"})
public class CreateController extends HttpServlet {

    private final static String ERROR = "createuser.jsp";
    private final static String SUCCESS = "login.html";

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
            String userID = request.getParameter("userID");
            String fullName = request.getParameter("fullName");
            String roleID = request.getParameter("roleID");
            String password = request.getParameter("password");
            String confirm = request.getParameter("confirm");
            System.out.println(password);
            System.out.println(confirm);
            UserError error = new UserError("", "", "", "", "");
            boolean flag = true;  //true = k loi - false = co loi
            if (userID != null && (userID.length() < 2 || userID.length() > 10)) {
                error.setUserIDError("UserID must be [2-10]");
                flag = (false);
            }
            if (fullName != null && (fullName.length() < 5 || fullName.length() > 10)) {
                error.setFullNameError("fullName must be [5-10]");
                flag = (false);
            }
            if (roleID != null && (roleID.length() < 2 || roleID.length() > 5)) {
                error.setRoleIDError("roleID must be [2-5]");
                flag = (false);

            }
            if (!password.equals(confirm)) {
                error.setConfirm("Hai password khong giong nhau");
                flag = (false);
            }
            if (flag) {
//                UserDAO dao = new UserDAO();
//                boolean check = dao.checkDuplicate(userID);
//                if (check) {
//                    error.setUserIDError("Dulicate UserID");
//                    request.setAttribute("ERROR", error);
//                } else {
//                    UserDTO user = new UserDTO(userID, fullName, roleID, password);
//                    dao.insert(user);
//                    url = SUCCESS;
//                }
                UserDAO dao = new UserDAO();
                UserDTO user = new UserDTO(userID, fullName, roleID, password);
                dao.insert(user);
                url = SUCCESS;

            } else {
                request.setAttribute("ERROR", error);
            }
        } catch (Exception e) {
            if (e.toString().contains("duplicate")) {
                log("Error at createcontroller:" + e.getMessage());
            }
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
