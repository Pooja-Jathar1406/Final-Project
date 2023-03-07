package com.pooja.service;

import java.util.List;

import com.pooja.model.Location;

public interface LocationService {
    List<Location> getLocations();
    Location addLocation(Location location);
}