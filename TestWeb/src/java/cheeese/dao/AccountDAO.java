/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeese.dao;

import cheeese.dbconnect.DBContext;
import cheeese.entry.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class AccountDAO {
//    Connection conn = null; // ket qua sql server
//    PreparedStatement ps = null; // nem cau lenh query sang sql
//    ResultSet rs = null; // nhan biuen ket qua
//   
//    public Account getListAccount(String user,String password){
//        try {
//            String query = "select * from account where username ='omen15' and password ='123'";
//            conn = new DBContext().getconnection(); // mo kket noi den server
//            ps = conn.prepareStatement(query); // nem cau lenh query 
//            ps.setString(1, user);
//            ps.setString(2, password);
//            rs = ps.executeQuery(); // excute query va nhan ket qua
////            List<Account> list = new ArrayList<>();
//            while (rs.next()) {                
//                Account a = new Account(rs.getString(1), rs.getString(2));
////                list.add(a);
//        return a;
//            }
////            for (Account a : list) {
////                System.out.println("name" + a.getUser()+"password"+a.getPassword());
////            }
////            return list;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } 
//        return null;
//        
//}
}
