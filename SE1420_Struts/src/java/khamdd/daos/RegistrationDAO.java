/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import khamdd.dtos.RegistrationDTO;

/**
 *
 * @author KHAM
 */
public class RegistrationDAO {

    private static final String connString = "jdbc:sqlserver://localhost:1433;databaseName=Sinhvien";
    private static final String user = "kham";
    private static final String pass = "kham";

    public RegistrationDAO() {
    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "failed";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "Select Role from Registration Where Username = ? and Password = ?";
        try (Connection conn = DriverManager.getConnection(connString, user, pass);
                PreparedStatement preStm = conn.prepareStatement(sql)) {
            preStm.setString(1, username);
            preStm.setString(2, password);
            try (ResultSet rs = preStm.executeQuery()) {
                if(rs.next()){
                    role = rs.getString("Role");
                }
            }
        }
        return role;
    }
        

    public List<RegistrationDTO> findByLikeName(String search) throws Exception {
        List<RegistrationDTO> result = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "Select Username, Fullname, Role from Registration Where Fullname LIKE ?";
        try (Connection conn = DriverManager.getConnection(connString, user, pass);
                PreparedStatement preStm = conn.prepareStatement(sql)) {
            preStm.setString(1, "%" + search + "%");
            try (ResultSet rs = preStm.executeQuery()) {
                result = new ArrayList<>();
                while (rs.next()) {
                    String username = rs.getString("Username");
                    String fullname = rs.getString("Password");
                    String role = rs.getString("Role");
                    RegistrationDTO dto = new RegistrationDTO(username, fullname, role);
                    result.add(dto);
                }
            }
        }
        return result;
    }
}
