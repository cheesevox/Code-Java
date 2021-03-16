/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheesevox.dbutils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
//import javax.sql.DataSource;
/**
 *
 * @author Admin
 */
public class DBUtils {
    public static Connection getConnection() throws  NamingException,SQLException,ClassNotFoundException{
        Context context = new InitialContext();
        Context resource = (Context) context.lookup("java:comp/env");
        DataSource db = (DataSource) resource.lookup("DB");
        return db.getConnection();
    }
}
