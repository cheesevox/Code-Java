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
public class CateDTO {
private String cateID, name, description;

    public CateDTO(String cateID, String name) {
        this.cateID = cateID;
        this.name = name;
    }

    public CateDTO() {
    }

    public String getCateID() {
        return cateID;
    }

    public void setCateID(String cateID) {
        this.cateID = cateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
