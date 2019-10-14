package com.example.invoicegenerator.factory;

import com.example.invoicegenerator.model.Ride;
import com.example.invoicegenerator.model.RideType;

public class ObjectFactory {
    public static Ride minFareRide = new Ride(0, 1, RideType.NORMAL);
    public static Ride normalRide = new Ride(10, 1, RideType.NORMAL);
}
