/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.models;

import java.io.Serializable;
import khamdd.daos.RegistrationDAO;

/**
 *
 * @author KHAM
 */
public class TestBean implements Serializable{
    private String username, password;

    private RegistrationDAO dao;
    public TestBean() {
        dao = new RegistrationDAO();
    }
    
    public String checkLogin() throws Exception {
        return dao.checkLogin(username, password);
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
    
    
}
