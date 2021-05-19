package com.zup.vehicleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesFromUserController {

    @GetMapping("/vehiclesUser")
    public String listVehiclesUser() {
        return "An vehicle from user";
    }
}
