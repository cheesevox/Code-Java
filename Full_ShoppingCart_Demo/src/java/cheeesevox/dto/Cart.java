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
public class Cart implements Serializable{
    private String customerName;
    private HashMap<String, ProductDTO> shoppingCart;

    
    
    public Cart() {
        this.customerName = "Guest";
        this.shoppingCart = new HashMap<>();
    }

    public Cart(String customerName) {
        this.customerName = customerName;
        this.shoppingCart = new HashMap<>();
        
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public HashMap<String, ProductDTO> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(ProductDTO dto ) throws  Exception{
        if(this.shoppingCart.containsKey(dto.getProductID())){
            int quantity = this.shoppingCart.get(dto.getProductID()).getQuantity() + 1;
            dto.setQuantity(quantity);
        }
        this.shoppingCart.put(dto.getProductID(), dto);
    }
    public void update(String id, int quantity) throws Exception{
        if(shoppingCart.containsKey(id)){
            this.shoppingCart.get(id).setQuantity(quantity);
        }
    }
    public void remove(String id) throws Exception{
        if(this.shoppingCart.containsKey(id)){
            this.shoppingCart.remove(id);
        }
    }
    public float getTotal(){
        float total = 0;
        for (ProductDTO dto : this.shoppingCart.values()) {
            total +=dto.getQuantity()*dto.getPrice();
        }
        return total;
    }
}
