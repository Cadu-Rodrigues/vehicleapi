package com.cadu.vehicleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {

    @GetMapping("/vehicles")
    public String listVehicles() {
        return "An vehicle";
    }
}
