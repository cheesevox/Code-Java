/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dto;

/**
 *
 * @author cheeese vox
 */
public class RegistractionErrorObject {
    private String usernameError,passwordError,comfirmError,fullnameError;

    public RegistractionErrorObject() {
    }

    public RegistractionErrorObject(String usernameError, String passwordError, String comfirmError, String fullnameError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.comfirmError = comfirmError;
        this.fullnameError = fullnameError;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public String getComfirmError() {
        return comfirmError;
    }

    public void setComfirmError(String comfirmError) {
        this.comfirmError = comfirmError;
    }

    public String getFullnameError() {
        return fullnameError;
    }

    public void setFullnameError(String fullnameError) {
        this.fullnameError = fullnameError;
    }
    
}
