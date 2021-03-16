/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.controller;

import cheeesevox.dao.OrderDAO;
import cheeesevox.dao.ProductDAO;
import cheeesevox.dto.Cart;
import cheeesevox.dto.OrderDTO;
import cheeesevox.dto.OrderDetailDTO;
import cheeesevox.dto.ProductDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cheeese vox
 */
public class OrderController extends HttpServlet {

    private static final String ERROR = "error.jsp";
    private static final String SUCCESS = "index.jsp";

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            //order : OD-username - countorder
            //orderDetailID : OD-usernmae - countorder- countproduct (orderid-countproduct)
            HttpSession session = request.getSession();
            Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
            String username = shoppingCart.getCustomerName();
            OrderDAO orderDAO = new OrderDAO();
            String orderID = orderDAO.getLastOrderIDByUser(username);
            ProductDAO proDAO = new ProductDAO();

            if (orderID == null) {
                orderID = "OD-" + username + "-1";
            } else {
                String[] tmp = orderID.split("-");
                int count = Integer.parseInt(tmp[2]);
                orderID = "OD-" + username + "-" + (count + 1);
            }
            Date dateOfCreate = new Date();
            float total = shoppingCart.getTotal();
            String status = "waiting";
            OrderDTO orderDTO = new OrderDTO();
            if (orderDAO.insertOrder(orderDTO)) {
                int count = 1;
                for (ProductDTO productDTO : shoppingCart.getShoppingCart().values()) {
                    String orderDetailID = orderID + "-" + count++;
                    //orderdetail, orderid, productid, quantity, quantity, price 
                    OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
                    orderDetailDTO.setOrderDetailID(orderDetailID);
                    orderDetailDTO.setOrderID(orderID);
                    orderDetailDTO.setProductID(productDTO.getProductID());
                    orderDetailDTO.setQunatity(productDTO.getQuantity());
                    orderDetailDTO.setPrice(productDTO.getPrice());
                    //check qoh 
                    //check qoh using transaction
                    ProductDTO proQOH = proDAO.findByPrimaryKey(productDTO.getProductID());
                    if (proQOH.getQuantity() > productDTO.getQuantity()) {
                        orderDAO.insertOrderDetail(orderDetailDTO);
                        // orderDAO.insertOrderDetail(orderDetailDTO);
                        //update quantity qoh
                    } else {
                        System.out.println("not enough");
                    }
                    shoppingCart = null;
                    url = SUCCESS;
                }
            } else {
                request.setAttribute("ERROR", "Creat order failed");
            }
        } catch (Exception e) {
            log("errroe at order controller" + e.getMessage());
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
