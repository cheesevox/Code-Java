/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.model;

import cheeesevox.daos.RegistractionDAO;
import cheeesevox.dto.RegistractionDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class TriBean implements Serializable {

    private String username, password,fullname;
    private RegistractionDAO dao;
    private RegistractionDTO dto;
    public boolean insert()throws Exception{
        return dao.insert(dto);
    }
    public boolean update() throws Exception{
        return dao.update(dto);
    }
    public boolean delete() throws Exception{
        return dao.delete(username);
    }
    public RegistractionDTO findByPrimaryKey() throws Exception{
        return dao.findByPrimaryKey(username);
    }
    public String checkLogin() throws Exception {
        return dao.checkLogin(username, password);
    }
    public List<RegistractionDTO> findByLikeName() throws Exception{
        return dao.findByLikeName(username);
    }
    public TriBean() {
        dao = new RegistractionDAO();
    }

    public TriBean(String username, String password, RegistractionDAO dao) {
        this.username = username;
        this.password = password;
        this.dao = dao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public RegistractionDAO getDao() {
        return dao;
    }

    public void setDao(RegistractionDAO dao) {
        this.dao = dao;
    }

    public RegistractionDTO getDto() {
        return dto;
    }

    public void setDto(RegistractionDTO dto) {
        this.dto = dto;
    }
 
}
