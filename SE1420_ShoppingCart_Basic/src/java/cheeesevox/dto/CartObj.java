/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheeesevox.dto;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author cheeese vox
 */
public class CartObj implements Serializable{
    private String customerName;
    private HashMap<String ,BookDTO> cart;
    private float Total = 0 ;
    
    public  float getTotal(){
        float result = 0 ;
        for (BookDTO dto : this.cart.values()) {
            result +=dto.getQuantity()*dto.getPrice();
        }
        return result;
    }
    public CartObj() {
        this.customerName = "Guest";
        this.cart = new HashMap<>();
    }

    public CartObj(String customerName) {
        this.customerName = customerName;
        this.cart = new HashMap<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public HashMap<String, BookDTO> getCart() {
        return cart;
    }
    public void addCart(BookDTO dto) throws Exception{
        if(this.cart.containsKey(dto.getId())){
            int quantity = this.cart.get(dto.getId()).getQuantity()+1;
        }
        this.cart.put(dto.getId(), dto);
    }
    public void removeCart(String id) throws Exception{
        if(this.cart.containsKey(id)){
            this.cart.remove(id);
        }
    }
    public void updateCart(String id, int Quantity) throws Exception{
        if(this.cart.containsKey(id)){
            this.cart.get(id).setQuantity(Quantity);
        }
    }
}
