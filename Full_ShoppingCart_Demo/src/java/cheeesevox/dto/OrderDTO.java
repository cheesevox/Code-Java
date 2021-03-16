/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cheeese vox
 */
public class OrderDTO implements Serializable{
    private String orderID,Username,status;
    private float total;
    private Date dateOfCreate;

    public OrderDTO() {
    }

    public OrderDTO(String orderID, String Username, String status, float total, Date dateOfCreate) {
        this.orderID = orderID;
        this.Username = Username;
        this.status = status;
        this.total = total;
        this.dateOfCreate = dateOfCreate;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(Date dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }
    
}
