/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.model;

import cheeesevox.dao.RegistrationDAO;
import cheeesevox.dto.RegistrationDTO;

/**
 *
 * @author cheeese vox
 */
public class TriBean {
    private String username, password, fullname;
    private RegistrationDAO dao;
    private RegistrationDTO dto;

    public TriBean() {
    }

    public TriBean(String username, String password, String fullname, RegistrationDAO dao, RegistrationDTO dto) {
        this.username = username;
        this.fullname = fullname;
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

    public RegistrationDAO getDao() {
        return dao;
    }

    public void setDao(RegistrationDAO dao) {
        this.dao = dao;
    }

    public RegistrationDTO getDto() {
        return dto;
    }

    public void setDto(RegistrationDTO dto) {
        this.dto = dto;
    }
    
}
