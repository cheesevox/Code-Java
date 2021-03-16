/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cheeese vox
 */
public class MyConnection {

    private final String serverName = "localhost";
    private final String dbName = "studentFU";
    private final String portNumber = "2301";
    private final String userID = "sa";
    private final String password = "123";

    public Connection getMyConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
}
