package com.senai.infoa.dvdrental.models;
import java.time.LocalDateTime;

public class City {
    
    int cityId;
    String city;
    //countryId
    LocalDateTime lastUpdate;

    public City() {}

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    

}
