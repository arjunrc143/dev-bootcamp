package com.example.invoicegenerator.services;

import com.example.invoicegenerator.dto.InvoiceDto;
import com.example.invoicegenerator.factory.ObjectFactory;
import com.example.invoicegenerator.model.Ride;
import com.example.invoicegenerator.persistance.RideRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InvoiceServiceTest {

    @Mock
    RideRepository rideRepository;

    @Test
    public void shouldReturnInvoiceFromUserId() {
        List<Ride> rides = Arrays.asList(ObjectFactory.minFareRide, ObjectFactory.normalRide);
        when(rideRepository.getRides(1)).thenReturn(rides);
        InvoiceService invoiceService = new InvoiceService(rideRepository);
        InvoiceDto invoice = invoiceService.getInvoice(1);
        assertEquals(53, invoice.getAvgFare(), 0.1);
        assertEquals(106, invoice.getTotalFare(), 0.1);
        assertEquals(2, invoice.getTotalRides(), 0.1);
    }
}


