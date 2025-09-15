package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Category {
    
    int categoryId;
    String name;
    LocalDateTime lastUpdate;

    //contrutor default
    public Category() {}


    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    


}
