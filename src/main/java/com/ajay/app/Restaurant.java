package com.ajay.app;


import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;

@Data
public class Restaurant {


    Restaurant(Long id, Double lat, Double lng) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

    private Long id;

    private Double lat;
    private Double lng;

    //private String pincode;
    //private String areaCode;

    private Timestamp createdAt;

    //Not used
    private Pincode pincode;
}