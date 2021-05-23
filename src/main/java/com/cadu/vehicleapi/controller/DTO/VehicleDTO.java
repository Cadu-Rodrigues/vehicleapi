package com.cadu.vehicleapi.controller.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.service.VehicleService;

public class VehicleDTO {
    public String brand;
    public String model;
    public String year;
    public String value;
    public int ownerCPF;
    public String rodizioDay;
    public Boolean rodizioIsAtive;
    private VehicleService vehicleService = new VehicleService();

    public VehicleDTO(Vehicle vehicle) throws Exception {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.year = vehicle.year;
        this.value = vehicle.value;
        this.ownerCPF = vehicle.owner.CPF;
        this.rodizioDay = vehicleService.getRodizioDay(vehicle);
        this.rodizioIsAtive = vehicleService.getRodizioAtive(this, LocalDate.now());
    }

    public VehicleDTO() {

    }

}
