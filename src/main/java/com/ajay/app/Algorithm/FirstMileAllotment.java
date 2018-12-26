package com.ajay.app.Algorithm;

import com.ajay.app.DeliveryExecutive;
import com.ajay.app.Order;
import com.sun.xml.internal.dtdparser.DTDEventListener;

import java.util.List;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
public class FirstMileAllotment implements IAllotment, IPriorityAllocation {

    public DeliveryExecutive allotAnOrderToDeliveryExecutive(Order order, List<DeliveryExecutive> DElist) {

        if (false) {
            this.allotAnOrderToDeliveryExecutiveOnPriority(order, DElist);
        }

        if (DElist != null && DElist.size() > 0) {
            return DElist.get(0);
        }
        return null;

    }

    public DeliveryExecutive allotAnOrderToDeliveryExecutiveOnPriority(Order order, List<DeliveryExecutive> DElist) {

        return null;
    }

}
