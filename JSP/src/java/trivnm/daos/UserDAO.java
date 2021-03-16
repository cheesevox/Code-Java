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
import trivnm.dtos.UserDTO;
import trivnm.utils.DBUtils;

/**
 *
 * @author Admin
 */
public class UserDAO {
    public UserDTO checkLogin(String userID, String password) throws SQLException{
        UserDTO user = null;
        Connection conn=null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn!=null){
                String sql ="SELECT fullname,roleID "
                        + "From tbl_User "
                        + "Where userID = '" + userID +"' And Password = '" +password+"'";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                if(rs.next()){
                    String fullname = rs.getString("fullname");
                    String roleID = rs.getString("roleID");
                    user = new UserDTO(userID, fullname, roleID, "");
                }
            }
        } catch (Exception e) {
        }finally{
            if(rs!=null) rs.close();
            if(stm!=null) stm.close();
            if(conn!=null) conn.close();
                
        }
        return user;
    }
    public List<UserDTO> getListUser(String search) throws SQLException{
        List<UserDTO> list = null;
        Connection conn =null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if(conn!=null){
                String sql = "SELECT userID, fullname, roleID "
                        + "From tbl_User "
                        + "Where fullname Like ?";
                stm=conn.prepareStatement(sql);
                stm.setString(1, "%"+search+"%");
                rs = stm.executeQuery();
                while(rs.next()){
                    if(list==null){
                        list = new ArrayList<>();
                        String userID = rs.getString("userID");
                        String fullname = rs.getString("fullname");
                        String roleID = rs.getString("roleID");
                        String password = rs.getString("password");
                        list.add(new UserDTO(userID, fullname, roleID, password));
                    }
                }
            }
        } catch (Exception e) {
        }finally{
            if(rs!=null) rs.close();
            if(stm!=null)stm.close();
            if(conn!=null) conn.close();
        }
        return list;
    }
}
