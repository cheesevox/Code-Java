/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.action;

import cheeesevox.dao.RegistrationDAO;
import cheeesevox.dto.RegistrationDTO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import javax.xml.ws.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author cheeese vox
 */
public class InsertAction extends ActionSupport {
    private String username,password,confirm,phoneNo, email;
    public String getUsername() {
        return username;
    }
    @RequiredStringValidator(type = ValidatorType.FIELD,
            message = "Usernmae can't be blank")
    @StringLengthFiledValidator(type = ValidatorType.FIELD,
            mixLength="6";
            maxLength="20";
            message = "username must be 6 to 20";
            )
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
@RegexFieldValidator(type = ValidatorType.FIELD,
        message = "your number is invalid",
        regex = "\\d{3}-\\d{7}")
        
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }
    @EmailValidator(type = ValidatorType.FIELD, message = "your email in valid")
    public void setEmail(String email) {
        this.email = email;
    }
    
    public InsertAction() {
    }
    
    public String execute() throws Exception {
        System.out.println("exe.....");
        return "success";
    }
    @Action(value = "/insert", 
            exceptionMapping = {
            @ExceptionMapping(exception = "java.sql.SQLException",result = "input")
            },
            results = {
                @Result(name = "success",location = "/login.jsp"),
                @Result(name = "error",location = "/error.jsp"),
                @Result(name = "input",location = "/insertAnno.jsp")
                
            }
    )
    public String insert()throws Exception{
        RegistrationDTO dto = new RegistrationDTO(username, email, phoneNo);
        dto.setPassword(password);
        RegistrationDAO dao = new RegistrationDAO();
        if(dao.insert(dto)){
            return "sucess";
        }
        return "error";
    }
}
