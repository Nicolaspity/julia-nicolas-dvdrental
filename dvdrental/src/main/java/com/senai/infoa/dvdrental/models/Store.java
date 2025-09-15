package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class Store {
    
    int storeId;
    //manegerStaffId
    //addressId
    LocalDateTime lastUpdate;

    public Store() {}

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    

}
