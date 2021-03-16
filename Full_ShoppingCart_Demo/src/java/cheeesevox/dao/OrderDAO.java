/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import cheeesevox.connection.MyConnection;
import cheeesevox.dto.OrderDTO;
import cheeesevox.dto.OrderDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

/**
 *
 * @author cheeese vox
 */
public class OrderDAO {

    private Connection conn;
    private PreparedStatement preStm;
    private ResultSet rs;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();

        }
        if (preStm != null) {
            preStm.close();

        }
        if (conn != null) {
            conn.close();

        }
    }

    public OrderDAO() {
    }

    public String getLastOrderIDByUser(String username) throws Exception {
        String id = null;
        try {
            String sql = "Select OrderID from tbl_Orders"
                    + "Where DateOFCreate = (Select MAX(DateOfCreate) "
                    + "From tbl_ORders Where Username = ? ";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            rs = preStm.executeQuery();
            if (rs.next()) {
                id = rs.getString("OrderID1");
            }
        } finally {
            closeConnection();
        }
        return id;
    }
    public boolean insertOrder(OrderDTO dto) throws Exception{
        boolean check = false;
        try {
            String sql ="insert into tbl_OrderID, username,Status, Total,DateOfCreate) "
                    + "value (?,?,?,?)";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1 ,dto.getOrderID());
            preStm.setString(2, dto.getUsername());
            preStm.setString(3, dto.getStatus());
            preStm.setFloat(3, dto.getTotal());
            preStm.setTimestamp(5, new Timestamp(dto.getDateOfCreate().getTime()));
            check = preStm.executeUpdate() >0 ; 
        } finally {
            
        }
        return check;
    }
    public boolean insertOrderDetail(OrderDetailDTO dto) throws Exception{
        boolean check =false;
//        private String 
        try {
            String sql = "insert into tbl_orderDetail(OrderDetailID,OrderID,PRoductID,Quantity,Price)"
                    + "value(?,?,?,?)";
            conn = MyConnection.getMyConnection();
            preStm= conn.prepareStatement(sql);
            preStm.setString(1, dto.getOrderDetailID());
            preStm.setString(2, dto.getOrderID());
            preStm.setString(3, dto.getProductID());
            preStm.setInt(4, dto.getQunatity());
        } finally{
           
        }
        return check;
    }
}
