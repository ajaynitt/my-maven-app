package com.ajay.app;

import lombok.Data;

import java.util.List;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
@Data
public class DeliveryExecutive {

    public DeliveryExecutive(Long id, Double lat, Double lng) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
    }

    private Long id;

    private Double lat;
    private Double lng;

    //ASSIGNED , FREE
    private String status;

    private Order lastDeliveredOrder;
    private List<Order> currentAssignedOrder;

    //Not used
    private List<Pincode> serviceablePincode;

}
