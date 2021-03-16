/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author cheeese vox
 */
public class MyConnection {
public static Connection getMyConnection () throws Exception{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDrive");
    Connection conn = DriverManager.getConnection("jdbc:");
    return conn;
}    
}
