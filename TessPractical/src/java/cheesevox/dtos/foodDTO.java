/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheesevox.dtos;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class foodDTO {
private String foodID;
private String name;
private String description;
private float price;
private int cookingTime;
private boolean status;
private Date createDate;
    public foodDTO() {
    }

    public foodDTO(String foodID, String name, String description, float price, int cookingTime, boolean status, Date createDate) {
        this.foodID = foodID;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
