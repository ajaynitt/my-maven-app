package com.ajay.app.util;

import com.ajay.app.DeliveryExecutive;
import com.ajay.app.Restaurant;

import static javafx.scene.input.KeyCode.R;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
public class Util {

    //TODO
    public static Double toRad(Double a) {

        return 3.14 * Math.abs(a);
    }


    public static Double getDistanceBetweenRestaurentAndDeliveryExecutive(Restaurant restaurant, DeliveryExecutive deliveryExecutive) {

        //havorsine formula

        Double restaurantLat = restaurant.getLat();
        Double restaurantLng = restaurant.getLng();

        Double deLat = restaurant.getLat();
        Double deLng = restaurant.getLng();


        final int R = 6371;


        //auto generated code

        Double latDistance = toRad(restaurantLat - deLat);
        Double lonDistance = toRad(restaurantLng - deLng);

        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                Math.cos(toRad(restaurantLat)) * Math.cos(toRad(deLat)) *
                        Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        Double distance = R * c;

        return distance;


    }
}

