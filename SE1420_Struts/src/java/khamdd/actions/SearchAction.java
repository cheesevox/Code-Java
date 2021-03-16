/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khamdd.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import khamdd.daos.RegistrationDAO;
import khamdd.dtos.RegistrationDTO;

/**
 *
 * @author KHAM
 */
public class SearchAction extends ActionSupport {
    private String searchValue;
    private List<RegistrationDTO> listUser;

    public List<RegistrationDTO> getListUser() {
        return listUser;
    }
    
    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
    
    
    
    public SearchAction() {
    }
    
    @Override
    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        listUser = dao.findByLikeName(searchValue);
        return "success";
    }
    
}
