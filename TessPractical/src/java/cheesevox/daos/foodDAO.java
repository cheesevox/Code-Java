/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheesevox.daos;

import cheesevox.dbutils.DBUtils;
import cheesevox.dtos.foodDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class foodDAO {

    public ArrayList<foodDTO> getListFood(String search) throws Exception {
        ArrayList<foodDTO> list = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " SELECT id, name, description,price,cookingTime,status,createDate "
                        + " From tblFoods "
                        + " Where name like ? and status = 'true' ";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    String foodID = rs.getString("id");
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    float price = rs.getFloat("price");
                    int cookingTime = rs.getInt("cookingTime");
                    boolean status = rs.getBoolean("status");
                    Timestamp create = rs.getTimestamp("createDate");
                    list.add(new foodDTO(foodID, name, description, price, cookingTime, status, create));
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean deleteFood(boolean status) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "DELETE From tblFoods "
                        + " WHERE status = 'false' ";
                stm = conn.prepareStatement(sql);
                stm.setBoolean(6, status);
                check = stm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean updateFood(foodDTO food) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " UPDATE tblfoods "
                        + " SET name= ? , description = ?, price = ?, cookingTime = ?, status = ?, createDate = ?"
                        + " WHERE ID = ? ";
                stm = conn.prepareStatement(sql);
                stm.setString(1, food.getName());
                stm.setString(2, food.getDescription());
                stm.setFloat(3, food.getPrice());
                stm.setInt(4, food.getCookingTime());
                stm.setBoolean(5, food.isStatus());
                stm.setTimestamp(6, (Timestamp) food.getCreateDate());
                check = stm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean checkDuplicate(String foodID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT foodID FROM tblFoods WHERE ID = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, foodID);
            rs = stm.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;

    }

    public boolean addFood(foodDTO food) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO tblfoods (ID,name,description,price,cookingTime,status,createDate) VALUES(?,?,?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                stm.setString(1, food.getFoodID());
                stm.setString(2, food.getName());
                stm.setString(3, food.getDescription());
                stm.setFloat(4, food.getPrice());
                stm.setInt(5, food.getCookingTime());
                stm.setBoolean(6, true);
                stm.setTimestamp(7, (Timestamp) food.getCreateDate());
                stm.executeUpdate();
            }

        } catch (Exception e) {
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean updateFood(String id, String name, String description, String price, String cookingTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
