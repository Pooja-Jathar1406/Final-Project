package com.pooja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pooja.model.Location;

@Service
public class LocationServiceImpl implements LocationService {
    private List<Location> locations = new ArrayList<>();

    @Override
    public List<Location> getLocations() {
        return locations;
    }

     
	@Override
	public Location addLocation(Location location) {
		// TODO Auto-generated method stub
		return null;
	}
}