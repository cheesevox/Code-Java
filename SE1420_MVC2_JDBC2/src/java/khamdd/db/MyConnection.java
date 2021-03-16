/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author KHAM
 */
public class MyConnection implements Serializable{
//    public static Connection GetMyConnection() throws ClassNotFoundException, SQLException, Exception {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:2301;databaseName=Sinhvien","sa","123");
//        return conn;
//    } 
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=mangement","sa","1623");
        return conn;
    }
}
