/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dtos;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author admin
 */
public class FoodDTO {

    private String foodID;
    private String name;
    private String desciption;
    private float price;
    private int cookingTime;
    private boolean status;
    private Timestamp createDate;

    public FoodDTO() {
    }

    public FoodDTO(String foodID, String name, String desciption, float price, int cookingTime, boolean status, Timestamp createDate) {
        this.foodID = foodID;
        this.name = name;
        this.desciption = desciption;
        this.price = price;
        this.cookingTime = cookingTime;
        this.status = status;
        this.createDate = createDate;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Timestamp getCreate() {
        return createDate;
    }

    public void setCreate(Timestamp create) {
        this.createDate = createDate;
    }

    
}
