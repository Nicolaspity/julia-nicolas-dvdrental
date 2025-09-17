package com.senai.infoa.dvdrental.models;
import java.sql.Blob;
import java.time.LocalDateTime;

public class Staff {

    int staffId;
    String firstName;
    String lastName;
    //addressId
    String email;
    //storeId
    Boolean active;
    String username;
    String password;
    LocalDateTime lastUpdate;
    Blob picture;
    
}
