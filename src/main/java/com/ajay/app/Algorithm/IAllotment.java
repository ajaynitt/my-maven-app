package com.ajay.app.Algorithm;

import com.ajay.app.DeliveryExecutive;
import com.ajay.app.Order;

import java.util.List;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
public interface IAllotment {

    public DeliveryExecutive allotAnOrderToDeliveryExecutive(Order order, List<DeliveryExecutive> DElist);

}
