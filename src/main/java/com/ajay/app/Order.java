package com.ajay.app;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
@Data

//order with restaurant info
public class Order {

    Order(Long id, Restaurant restaurant) {
        this.id = id;
        this.restaurant = restaurant;
        this.state = "PENDING";
    }

    private Long id;
    private Timestamp createdAt;
    private Timestamp deliveredAt;

    //state of the order- PENDING, ACCEPTED_BY_RESTAURANT, PREPARING, DISPATCHED, DELIVERED
    private String state;

    //map to restaurant
    private Restaurant restaurant;

    //map to delivery executive
    //in real world id will be enough , object is not required
    private DeliveryExecutive deliveryExecutive;

}
