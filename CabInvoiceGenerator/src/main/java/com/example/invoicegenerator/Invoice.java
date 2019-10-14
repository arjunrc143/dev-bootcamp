package com.example.invoicegenerator;

import com.example.invoicegenerator.model.Ride;

import java.util.List;

public class Invoice {
    private List<Ride> rides;
    private double fare;
    private double totalRides;
    private double avgFare;

    public double getFare() {
        return fare;
    }

    public double getTotalRides() {
        return totalRides;
    }

    public double getAvgFare() {
        return avgFare;
    }

    public Invoice(List<Ride> rides) {
        this.rides = rides;
    }

    private double fare() {
       return rides.stream()
               .mapToDouble(Ride::fare)
               .sum();
    }

    public void calculateInvoice() {
        this.totalRides = rides.size();
        this.fare = fare();
        this.avgFare = this.fare / this.totalRides;
    }

}
