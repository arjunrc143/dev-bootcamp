package com.example.invoicegenerator.dto;

public class InvoiceDto {
    private double totalRides;
    private double totalFare;
    private double avgFare;

    public InvoiceDto(double totalRides, double totalFare, double avgFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
    }

    public double getTotalRides() {
        return totalRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAvgFare() {
        return avgFare;
    }
}
