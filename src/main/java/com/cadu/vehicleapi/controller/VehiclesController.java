package com.cadu.vehicleapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cadu.vehicleapi.model.Vehicle;

@RestController
public class VehiclesController {

    @GetMapping("/vehicles")
    public List<Vehicle> listVehicles() {
        Vehicle vehicle = new Vehicle("Ford", "Fiesta", 2009, 10000, 1234);
        Vehicle vehicle2 = new Vehicle("Ford", "Fusion", 2009, 20000, 1234);
        Vehicle vehicle3 = new Vehicle("Ford", "Ka", 2009, 30000, 1234);
        return Arrays.asList(vehicle, vehicle2, vehicle3);
    }
}
