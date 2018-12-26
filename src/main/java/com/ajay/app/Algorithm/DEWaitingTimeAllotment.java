package com.ajay.app.Algorithm;

import com.ajay.app.DeliveryExecutive;
import com.ajay.app.Order;

import java.util.List;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
public class DEWaitingTimeAllotment implements IAllotment  {

    public DeliveryExecutive allotAnOrderToDeliveryExecutive(Order order, List<DeliveryExecutive> DElist) {

        if (DElist != null && DElist.size() == 0) {
            return DElist.get(0);
        }

        if (DElist != null && DElist.size() > 1) {
            return DElist.get(1);
        }
        return null;

    }
}
