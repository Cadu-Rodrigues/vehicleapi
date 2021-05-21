package com.cadu.vehicleapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadu.vehicleapi.controller.DTO.VehicleDTO;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.repository.VehiclesRepository;

@RestController
public class VehiclesController {

    @Autowired
    private VehiclesRepository repository;

    @GetMapping("/vehicles")
    public List<VehicleDTO> listVehicles() {
        VehicleDTO dto = new VehicleDTO();
        List<Vehicle> vehicles = repository.findAll();
        return dto.convert(vehicles);
    }
}
