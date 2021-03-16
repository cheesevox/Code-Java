/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dao;

import cheeesevox.connection.MyConnection;
import cheeesevox.dto.CateDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class CateDAO {
private Connection conn;
private PreparedStatement preStm;
private ResultSet rs ; 
private void closeConnection()throws Exception{
    if(rs !=null){
        rs.close();
        
    }if(preStm !=null){
        preStm.close();
        
    }if(conn !=null){
        conn.close();
        
    }
}
public List<CateDTO> findAllCate() throws Exception{
    List<CateDTO> result = null; 
    String id, name ;
    CateDTO dto = null;
    try {
        String sql = "select CateID, Name from tbl_Category";
        conn = MyConnection.getMyConnection();
        preStm=conn.prepareStatement(sql);
        rs = preStm.executeQuery();
        result= new ArrayList<>();
        while (rs.next()) {            
            id=rs.getString("CateID");
            name=rs.getString("Name");
            dto = new CateDTO(id, name);
            result.add(dto);
        }
    } catch (Exception e) {
    }
    return null;
}
}
