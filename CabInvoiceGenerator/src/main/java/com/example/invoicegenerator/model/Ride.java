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

    public double fare() {
        return rideType.fare(distance, duration);
    }
}
