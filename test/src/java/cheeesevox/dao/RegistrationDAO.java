/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import cheeesevox.dto.RegistrationDTO;
import com.opensymphony.xwork2.Preparable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class RegistrationDAO {

    private static final String connString = "jdbc:sqlserver://localhost:2301;databaseName=SinhVien";
    private static final String user = "sa";
    private static final String pass = "123";

    public RegistrationDAO() {
    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "failed";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "select Role From Registration Where Username = ? and password = ? ";
        try (Connection conn = DriverManager.getConnection(connString, user, pass)) {
            PreparedStatement preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            try (ResultSet rs = preStm.executeQuery()) {
                if (rs.next()) {
                    role = rs.getString("Role");
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return role;
    }

    public List<RegistrationDTO> findByLikeName(String search) throws Exception {
        List<RegistrationDTO> result = null;
        String sql = "Select Username, Fullname, Role From Registration Where Fullname LIKE ?";
        try (Connection conn = DriverManager.getConnection(connString, user, pass);
                PreparedStatement preStm = conn.prepareStatement(sql)) {
            preStm.setString(1, "%" + search + "%");
            try (ResultSet rs = preStm.executeQuery()) {
                result = new ArrayList<>();
                while (rs.next()) {
                    String username = rs.getString("Username");
                    String fullname = rs.getString("Fullname");
                    String role = rs.getString("Role");
                    RegistrationDTO dto = new RegistrationDTO(username, fullname, role);
                    result.add(dto);
                }
            }
        }

        return result;

    }
    public boolean insert(RegistrationDTO dto) throws Exception{
        boolean check = false;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "Insert Into Registration (Username, Password, Fullname,Role )"+"value (?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(connString,user,pass);
                PreparedStatement preStm = conn.prepareStatement(sql)){
            preStm.setString(1, username);
            preStm.setString(2, password);
        } catch (Exception e) {
        }
    }
}
