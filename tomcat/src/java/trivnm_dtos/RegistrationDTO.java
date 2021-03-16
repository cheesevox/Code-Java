/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivnm_dtos;

/**
 *
 * @author Admin
 */
public class RegistrationDTO {
    String username;
    String password;
    String fullname;
    String roleID;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String username, String password, String fullname, String roleID) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.roleID = roleID;
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

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }
   
}
