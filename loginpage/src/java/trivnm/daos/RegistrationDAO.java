/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivnm.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.Registration;
import trivnm.db.DBUtils;
import trivnm.dtos.RegistrationDTO;

/**
 *
 * @author Admin
 */
public class RegistrationDAO {
    public RegistrationDTO checkLogin(String username,String password) throws SQLException{
        RegistrationDTO user = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn != null){
                String sql = " select fullname, role from registration where username = '"+username+"' and password = '"+password+"'";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
            }if(rs.next()){
                String fullname = rs.getString("fullname");
                String role =rs.getString("role");
                user = new RegistrationDTO(username, "", fullname, role);
            }
        } catch (Exception e) {
        }finally{
            if(rs!=null)rs.close();
            if(stm!=null)stm.close();
            if(conn!=null)conn.close();
        }
        return user;
    }
    public List<RegistrationDTO> getListUser(String search) throws SQLException{
        List<RegistrationDTO> list = null;
        Connection conn =null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn != null){
            String sql = "select username,fullname,role from registration where fullname like ?" ;
            stm =conn.prepareStatement(sql);
            stm.setString(1, "%"+search+"%");
            rs=stm.executeQuery();
                while (rs.next()) {                    
                    if(list==null){
                        list = new ArrayList<>();
                        String username = rs.getString("username");
                        String fullname = rs.getString("fullname");
                        String role = rs.getString("role");
                        String password="";
                        list.add(new RegistrationDTO(username, password, fullname, role));
                    }
                }
        }
        } catch (Exception e) {
        }finally {
            if(rs!=null)rs.close();
            if(stm!=null)stm.close();
            if(conn!=null)conn.close();
        }
        return list;
    }
}
