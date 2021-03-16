/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import cheeesevox.connection.MyConnection;
import cheeesevox.dto.ProductDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class ProductDAO {

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

    public void ProductDAO() {

    }

    public List<ProductDAO> findProductByCateID(String cateID) throws Exception {
        List<ProductDAO> result = null;
        String name, id;
        ProductDTO dto = null;
        float price;
        try {
            String sql = "Select ProductID, Name, Price From tbl_Product Where CateID = ? ";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, cateID);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                name = rs.getString("name");
                id = rs.getString("ProductID");
                price = rs.getFloat("Price");
                dto = new ProductDTO(id, name, price);
                result.add(dto);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    public ProductDTO findByPrimaryKey (String id) throws Exception{
        ProductDTO dto = null;
        try {
            String sql = "select productID, Name, quantity, Description, CateID,Price "
                    + "From tbl_Product where PRoductID = ?";
            conn = MyConnection.getMyConnection();
            preStm =conn.prepareStatement(sql);
            preStm.setString(1, id);
            rs=preStm.executeQuery();
            if(rs.next()){
                String name = rs.getString("Name");
                int quantity = rs.getInt("quantity");
                String des = rs.getString("Description");
                String cateID= rs.getString("CateID");
                float price =rs.getFloat("Price");
                dto =new ProductDTO();
                
                
            }
        } catch (Exception e) {
        }
        return null;
        
    }
}
