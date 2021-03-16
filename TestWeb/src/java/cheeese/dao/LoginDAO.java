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
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class LoginDAO {
    Connection conn = null;
    PreparedStatement ps = null; 
    ResultSet rs = null;
    public Account checkLogin(String user, String password){
        try {
            String query = "select * from account where user =? and password =?";
            conn = new DBContext().getconnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a =new Account(rs.getString(1),rs.getString(2));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }
  
//    public List<Account> getListAccount(String user,String password){
//        try {
//            String query = "select * from account";
//            conn = new DBContext().getconnection(); // mo kket noi den server
//            ps = conn.prepareStatement(query); // nem cau lenh query 
//            ps.setString(1, user);
//            ps.setString(2, password);
//            rs = ps.executeQuery(); // excute query va nhan ket qua
////            List<Account> list = new ArrayList<>();
//            while (rs.next()) {                
//                List<Account> a = new Account(rs.getString(1), rs.getString(2));
//                list.add(a);
//        return a;
//            }
//            for (Account a : list) {
//                System.out.println("name" + a.getUser()+"password"+a.getPassword());
//            }
//            return list;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } 
//        return null;
    }

