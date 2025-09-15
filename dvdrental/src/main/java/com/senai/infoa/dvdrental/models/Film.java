package com.senai.infoa.dvdrental.models;
import java.security.Timestamp;

public class Film {
    
    int filmId;
    String tittle;
    String description;
    Timestamp releaseYear;
    Timestamp rentalDuration;
    int rentalRate;
    int length;
    float replacementCost;
    float rating;
    Timestamp lastUpdate;
    String specialFeatures;
    String fullText;

    public Film() {}

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Timestamp releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Timestamp getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Timestamp rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getFulltext() {
        return fullText;
    }

    public void setFulltext(String fulltext) {
        this.fullText = fulltext;
    }

    


    

}
