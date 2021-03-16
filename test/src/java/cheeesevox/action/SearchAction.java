/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.action;

import cheeesevox.dao.RegistrationDAO;
import cheeesevox.dto.RegistrationDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author cheeese vox
 */
public class SearchAction extends ActionSupport {
private String searchValue;
private List<RegistrationDTO> listUser;
    public SearchAction() {
    }

    public List<RegistrationDTO> getListuser() {
        return listUser;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
    
    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        listUser = dao.findByLikeName(searchValue);
        return  " success";
    }

    
}
