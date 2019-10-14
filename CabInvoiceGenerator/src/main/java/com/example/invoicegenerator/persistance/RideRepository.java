package com.example.invoicegenerator.persistance;

import com.example.invoicegenerator.model.Ride;

import java.util.List;

public interface RideRepository {
    public List<Ride> getRides(int userId);
}
