package com.example.invoicegenerator.model;

import org.junit.Test;

import static com.example.invoicegenerator.factory.ObjectFactory.minFareRide;
import static com.example.invoicegenerator.factory.ObjectFactory.normalRide;
import static org.junit.Assert.assertEquals;

public class RideTest {

    @Test
    public void shouldReturnMinimumFare() {
        double fare = minFareRide.fare();
        assertEquals(5, fare, 0.1);
    }

    @Test
    public void shouldReturnValidFareForDistanceAndDuration() {
        double fare = normalRide.fare();
        assertEquals(101, fare, 0.1);
    }
}
