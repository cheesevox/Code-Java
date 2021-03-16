/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.models;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import khamdd.db.MyConnection;
import khamdd.registration.RegistrationDTO;

/**
 *
 * @author KHAM
 */
public class RegistrationDAO implements Serializable {

    private Connection conn = null;
    private PreparedStatement preStm = null;
    private ResultSet rs = null;

    private void closeConnection() throws Exception {
        if (conn != null) {
            conn.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (rs != null) {
            rs.close();
        }
    }

    public RegistrationDAO() {
    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "failed";
        String sql = "SELECT Role FROM REGISTRATION Where Username = ? and Password =?";

        conn = MyConnection.getMyConnection();

        preStm = conn.prepareStatement(sql);
        preStm.setString(1, username);
        preStm.setString(2, password);

        rs = preStm.executeQuery();

        while (rs.next()) {
            role = rs.getString("Role");
        }
        return role;
    }

    public List<RegistrationDTO> findByLikeName(String search) throws SQLException, Exception {
        List<RegistrationDTO> result = null;
        String username = null;
        String fullname = null;
        String role = null;
        RegistrationDTO dto = null;
        String sql = "Select username, fullname, role from Registration where fullname LIKE ?";
        conn = MyConnection.getMyConnection();
        preStm = conn.prepareStatement(sql);
        preStm.setString(1, "%" + search + "%");
        rs = preStm.executeQuery();
        result = new ArrayList<>();
        while (rs.next()) {
            username = rs.getString("username");
            fullname = rs.getString("fullname");
            role = rs.getString("role");
            dto = new RegistrationDTO(username, fullname, role);
            result.add(dto);
        }

        rs.close();
        preStm.close();
        conn.close();
        return result;
    }

    public boolean delete(String id) throws Exception {
        boolean check = false;
        String sql = "Delete From Regitration Where Username = ?";
        conn = MyConnection.getMyConnection();
        preStm = conn.prepareStatement(sql);
        preStm.setString(1, id);
        check = preStm.executeUpdate() > 0;
        return check;
    }

    public boolean insert(RegistrationDTO dto) throws Exception {
        boolean check = false;
        String sql = "Insert Into Registration(Username, Password, Fullname, Role)"
                + "value(?,?,?,?)";
        conn = MyConnection.getMyConnection();
        preStm.setString(1, dto.getUsername());
        preStm.setString(2, dto.getPassword());
        preStm.setString(3, dto.getFullname());
        preStm.setString(4, dto.getRole());
        check = preStm.executeUpdate() > 0;
        return check;
    }

//    public RegistrationDTO findByPrimaryKey(String id) throws SQLException {
//        RegistrationDTO dto = null;
//        try {
//            String sql = "Select Fullname, Role From Registrantion Where Username = ? ";
//            conn = MyConnection.GetMyConnection();
//            preStm = conn.prepareStatement(sql);
//            preStm = setString(1, id);
//            rs = preStm.executeQuery();
//            if (rs.next()) {
//                String fullname = rs.getString("Fullname");
//                String role = rs.getString("Role");
//                dto = new RegistrationDTO(id, fullname, role);
//        }}
//            catch (Exception e) {
//                e.printStackTrace();
//                }finally{
//            closeConnection();
//        }
// 
//          
//    }

    public boolean update(RegistrationDTO dto) throws Exception {
        boolean check = false;
        try {
            String sql = "Update Regitration SEt Fullname = ?, Role = ? "
                    + "Where Usernmae = ?";
            conn = MyConnection.getMyConnection();
            preStm.setString(1, dto.getFullname());
            preStm.setString(2, dto.getRole());
            preStm.setString(1, dto.getUsername());
            check = preStm.executeUpdate() > 0;
        } catch (Exception e) {
      
        e.printStackTrace();}
        finally{
            closeConnection();
        }
        return check;
    }
}
