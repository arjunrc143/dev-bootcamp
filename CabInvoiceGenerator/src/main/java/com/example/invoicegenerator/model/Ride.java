package com.example.invoicegenerator.model;

public class Ride {
    private double distance;
    private double duration;
    private RideType rideType;

    public Ride(double distance, double duration, RideType rideType) {
        this.distance = distance;
        this.duration = duration;
        this.rideType = rideType;
    }

    private static final int MINIMUM_DISTANCE_FARE = 10;
    private static final int MINIMUM_DURATION_FARE = 1;
    private static final int MINIMUM_FARE = 5;

    public double fare() {
        if(this.rideType.equals(RideType.PREMIUM))
            return RideType.PREMIUM.fare(distance, duration);
        else
            return RideType.NORMAL.fare(distance, duration);
    }
}
