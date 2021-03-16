/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import cheeesevox.connection.MyConnection;
import cheeesevox.dto.RegistractionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cheeese vox
 */
public class RegistractionDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public RegistractionDTO checkLogin(String user,String pass){
        try {
            String sql = "select role from Test where username = ? and password = ? ";
            conn = new MyConnection().getMyConnection();
            ps =conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                RegistractionDTO dto = new RegistractionDTO(rs.getString(1) , rs.getString(2));
                return dto;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
