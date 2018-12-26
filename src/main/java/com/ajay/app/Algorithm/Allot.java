package com.ajay.app.Algorithm;

/**
 * Created by ajaykumar.yadav on 21/12/18.
 */
public class Allot {


    private IAllotment allotment;

    private String allotmentAlgorithm;

    public Allot(String allotmentAlgorithm) {
        //validations needed ?

        this.allotmentAlgorithm = allotmentAlgorithm;
    }


    public IAllotment getAllotmentObject() {

        switch (this.allotmentAlgorithm) {

            case "DE_WAITING_TIME":
                allotment = new DEWaitingTimeAllotment();
                break;

            case "ORDER_DELAY_TIME":
                allotment = new OrderDelayTimeAllotment();
                break;

            default:
            case "FIRST_MILE":
                allotment = new FirstMileAllotment();
                break;
        }

        return allotment;

    }


}
