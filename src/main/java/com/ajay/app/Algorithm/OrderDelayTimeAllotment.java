package com.ajay.app.Algorithm;

import com.ajay.app.DeliveryExecutive;
import com.ajay.app.Order;

import java.util.List;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
public class OrderDelayTimeAllotment implements IAllotment {

    public DeliveryExecutive allotAnOrderToDeliveryExecutive(Order order, List<DeliveryExecutive> DElist) {

        if (DElist != null && DElist.size() > 0 && DElist.size() < 2) {
            return DElist.get(0);
        }

        if (DElist != null && DElist.size() > 2) {
            return DElist.get(2);
        }
        return null;

    }
}
