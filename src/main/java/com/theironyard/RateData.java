package com.theironyard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 6/13/16.
 */
public class RateData {

    static public List<Rate> call(ShippingAddress userShipment){

        List <Rate> rateList = new ArrayList<>();

        rateList.add(new Rate("UPS",  17.99,"06/30/2016"));
        rateList.add(new Rate("FedEX", 200.59,"06/28/2016"));
        rateList.add(new Rate("USPS",  10.00,"07/01/2016"));
        return rateList;
    }

}

