/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.action;

import cheeesevox.dao.RegistrationDAO;
import cheeesevox.dto.RegistrationDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author cheeese vox
 */
public class RegisterAction extends ActionSupport {
    private static final String ERROR = "error";
    private static final String SUCCESS = "seccess";
    
private String username,password,comfirm,email,phoneNo;

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

    public String getComfirm() {
        return comfirm;
    }

    public void setComfirm(String comfirm) {
        this.comfirm = comfirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public RegisterAction() {
    }
    
    public String execute() throws Exception {
        String url = ERROR;
        RegistrationDAO dao = new RegistrationDAO();
        RegistrationDTO dto = new RegistrationDTO(username, email, phoneNO);
        dto.setPassword(password);
        if(dao.insert(dto)){
            url = SUCCESS;
        }
        
        return url;
        
        
    }
    
}
