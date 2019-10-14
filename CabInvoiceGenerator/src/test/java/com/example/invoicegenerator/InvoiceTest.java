package com.example.invoicegenerator;

import org.junit.Test;

import java.util.Arrays;

import static com.example.invoicegenerator.factory.ObjectFactory.minFareRide;
import static com.example.invoicegenerator.factory.ObjectFactory.normalRide;
import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    @Test
    public void shouldReturnValidFareForMultipleRides() {
        Invoice invoice = new Invoice(Arrays.asList(minFareRide, normalRide));
        invoice.calculateInvoice();
        assertEquals(106, invoice.getFare(), 0.1);
    }

    @Test
    public void shouldReturnStatementWithTotalRidesFareAndAvgFare() {
        Invoice invoice = new Invoice(Arrays.asList(minFareRide, normalRide));
        invoice.calculateInvoice();
        assertEquals(2, invoice.getTotalRides(), 0.1);
        assertEquals(106.0, invoice.getFare(), 0.1);
        assertEquals(53.0, invoice.getAvgFare(), 0.1);
    }
}
