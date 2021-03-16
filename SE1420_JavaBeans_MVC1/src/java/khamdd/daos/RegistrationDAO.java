/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author KHAM
 */
public class RegistrationDAO implements Serializable {

    private static final String connString = "jdbc:sqlserver://localhost:1433;databaseName=Sinhvien";
    private static final String user = "sa";
    private static final String pass = "123";

    public RegistrationDAO() {

    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "failed";
        String sql = "Select Role From Regisstration where Username = ? and Password =?";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        try (
                Connection conn = DriverManager.getConnection(connString, user, pass);
                PreparedStatement preStm = conn.prepareStatement(sql);
            ) {
            preStm.setString(1, username);
            preStm.setString(2, password);
            try (ResultSet rs = preStm.executeQuery()) {
                if (rs.next()) {
                    role = rs.getString("Role");
                }
            }
        }
        return role;
    }
}
