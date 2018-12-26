package com.ajay.app;


import com.ajay.app.Algorithm.Allot;
import com.ajay.app.Algorithm.IAllotment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        //creation of Restaurants
        List<Restaurant> restaurantList = new ArrayList<>();

        Restaurant restaurant1 = new Restaurant(1001L, 13.717711, 12.769878);
        restaurantList.add(restaurant1);

        Restaurant restaurant2 = new Restaurant(1002L, 13.716611, 12.775434);
        restaurantList.add(restaurant2);


        //creation of Delivery Executive

        List<DeliveryExecutive> deliveryExecutiveList = new ArrayList<>();

        deliveryExecutiveList.add(new DeliveryExecutive(200L, 13.711234, 12.764545));
        deliveryExecutiveList.add(new DeliveryExecutive(201L, 13.714234, 12.764545));
        deliveryExecutiveList.add(new DeliveryExecutive(202L, 13.719234, 12.764545));


        //creation of orders
        List<Order> orderList = new ArrayList<>();

        Order order1 = new Order(1L, restaurant1);
        orderList.add(order1);

        Order order2 = new Order(2L, restaurant2);
        orderList.add(order2);


        //process each order 1 by one and assign
        //redis and multi thread required for distributed system


        while (true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                Integer input = Integer.parseInt(bufferedReader.readLine());
                DeliveryExecutive deliveryExecutive = null;

                if (input == 1 || input > 3) {
                    deliveryExecutive = new Allot("FIRST_MILE").getAllotmentObject().allotAnOrderToDeliveryExecutive(order1, deliveryExecutiveList);

                    order1.setDeliveryExecutive(deliveryExecutive);
                } else if (input == 2) {
                    deliveryExecutive = new Allot("DE_WAITING_TIME").getAllotmentObject().allotAnOrderToDeliveryExecutive(order1, deliveryExecutiveList);

                    order1.setDeliveryExecutive(deliveryExecutive);

                } else if (input == 3) {
                    deliveryExecutive = new Allot("ORDER_DELAY_TIME").getAllotmentObject().allotAnOrderToDeliveryExecutive(order1, deliveryExecutiveList);

                    order1.setDeliveryExecutive(deliveryExecutive);

                }


                if (order1.getDeliveryExecutive() == null) {
                    System.out.println("couldn't find a delivery executive");
                } else {
                    System.out.println("found delivery executive with id " + order1.getDeliveryExecutive().getId());
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("error");
            }


        }
    }
}
