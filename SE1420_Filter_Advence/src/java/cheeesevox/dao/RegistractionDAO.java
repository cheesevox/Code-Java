/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cheeese vox
 */
public class RegistractionDAO implements Serializable {

    private static final String connString = "jdbc:sqlserver://localhost:2301;databaseName=SinhVien";
    private static final String user = "sa";
    private static final String pass = "123";

    public RegistractionDAO() {
    }

    public String checkLogin(String user, String pass) throws ClassNotFoundException, SQLException {
        String role = "failed";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "select Role From Registraction Where Username = ? and Password = ? ";
        try (Connection conn = DriverManager.getConnection(connString, user, pass)) {
         
        } catch (Exception e) {
        }finally{
           
        }
        
        
        return null;

    }
}
