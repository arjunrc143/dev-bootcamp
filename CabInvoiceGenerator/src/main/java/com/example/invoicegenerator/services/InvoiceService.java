package com.example.invoicegenerator.services;

import com.example.invoicegenerator.Invoice;
import com.example.invoicegenerator.dto.InvoiceDto;
import com.example.invoicegenerator.model.Ride;
import com.example.invoicegenerator.persistance.RideRepository;

import java.util.List;

public class InvoiceService {

    private RideRepository rideRepository;

    public InvoiceService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public InvoiceDto getInvoice(int userId) {
        List<Ride> rides = rideRepository.getRides(userId);
        Invoice invoice = new Invoice(rides);
        invoice.calculateInvoice();
        return new InvoiceDto(invoice.getTotalRides(), invoice.getFare(), invoice.getAvgFare());
    }
}
