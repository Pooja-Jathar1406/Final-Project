package com.pooja.cntr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pooja.model.Location;
import com.pooja.service.LocationService;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @PostMapping("/locations")
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }
}