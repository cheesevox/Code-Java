/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.daos;

import cheeesevox.db.MyConnection;
import cheeesevox.dto.RegistractionDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.soap.MTOM;

/**
 *
 * @author cheeese vox
 */
public class RegistractionDAO implements Serializable {

    private Connection conn;
    private PreparedStatement preStm;
    private ResultSet rs;

    public RegistractionDAO() {
    }

    public RegistractionDAO(Connection conn, PreparedStatement preStm, ResultSet rs) {
        this.conn = conn;
        this.preStm = preStm;
        this.rs = rs;
    }

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "failed";
        try {
            String sql = "Select Role From Registraction Where Username = ? and Password = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            rs = preStm.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
        } finally {
            closeConnection();
        }
        return role;
    }

    public List<RegistractionDTO> findByLikeName(String search) throws Exception {
        List<RegistractionDTO> result = null;
        String username, fullname, role;
        RegistractionDTO dto;
        try {
            String sql = "Select Username, Fullname, Role" + "From Registraction Where Fullname LIKE ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + search + "%");
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                username = rs.getString("Username");
                fullname = rs.getString("Fullname");
                role = rs.getString("Role");
                dto = new RegistractionDTO(username, fullname, role);
                result.add(dto);
            }

        } finally {
            closeConnection();
        }
        return result;
    }
    public boolean delete(String id) throws Exception{
        boolean check =false;
        try {
            String sql = "Delete From Registraction Where Username = ?";
            conn = MyConnection.getMyConnection();
            preStm=conn.prepareStatement(sql);
            preStm.setString(1, id);
            check = preStm.executeUpdate() > 0 ;
        }finally{
            closeConnection();
        }
        return check;
    }
    public RegistractionDTO findByPrimaryKey(String id) throws Exception{
        RegistractionDTO dto = null;
        try {
            String sql = "Select Fullname From Registraction Where Username = ? ";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, id);
            rs= preStm.executeQuery();
            if(rs.next()){
                String Fullname = rs.getString("Fullname");
                String Role = rs.getString("Role");
                dto = new RegistractionDTO(id, Fullname, Role);
            }
            
        }finally{
            closeConnection();
        }
        return dto;
    }
    public boolean update(RegistractionDTO dto ) throws Exception{
        boolean check = false;
        try {
            String sql = "update Registraction set Fullname = ?, Role = ? " + " Where Username =  ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getFullname());
            preStm.setString(1, dto.getRole());
            preStm.setString(1, dto.getUsername());
            check = preStm.executeUpdate() > 0 ;
        }finally{
            closeConnection();
        }
        return check;
}
    public boolean insert(RegistractionDTO dto ) throws Exception{
        boolean check = false;
        try {
            String sql = "Insert into Registraction(Username, Password,Fullname,Role)"+"Value(?,?,?,?)";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getUsername());
            preStm.setString(2, dto.getPassword());
            preStm.setString(3, dto.getFullname());
            preStm.setString(4, dto.getRole());
            check = preStm.executeUpdate()>0;
        }finally{
            closeConnection();
        }
        return check;
    }
}
