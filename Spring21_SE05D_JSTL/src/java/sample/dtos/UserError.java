/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dtos;

/**
 *
 * @author admin
 */
public class UserError {
    private String userIDError;
    private String fullNameError;
    private String roleIDError;
    private String password;
    private String confirm;

    public UserError() {
    }

    public UserError(String userIDError, String fullNameError, String roleIDError, String password, String confirm) {
        this.userIDError = userIDError;
        this.fullNameError = fullNameError;
        this.roleIDError = roleIDError;
        this.password = password;
        this.confirm = confirm;
    }

    public String getUserIDError() {
        return userIDError;
    }

    public String getFullNameError() {
        return fullNameError;
    }

    public String getRoleIDError() {
        return roleIDError;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setUserIDError(String userIDError) {
        this.userIDError = userIDError;
    }

    public void setFullNameError(String fullNameError) {
        this.fullNameError = fullNameError;
    }

    public void setRoleIDError(String roleIDError) {
        this.roleIDError = roleIDError;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
    
}
