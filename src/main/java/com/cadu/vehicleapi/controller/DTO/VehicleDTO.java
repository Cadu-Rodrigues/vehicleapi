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

    public List<VehicleDTO> convert(List<Vehicle> vehicles) throws Exception {
        List<VehicleDTO> array = new ArrayList<VehicleDTO>();
        for (int i = 0; i < vehicles.size(); i++) {
            VehicleDTO iterate = new VehicleDTO();
            iterate.brand = vehicles.get(i).brand;
            iterate.model = vehicles.get(i).model;
            iterate.year = vehicles.get(i).year;
            iterate.value = vehicles.get(i).value;
            iterate.ownerCPF = vehicles.get(i).owner.CPF;
            iterate.rodizioDay = vehicleService.getRodizioDay(vehicles.get(i));
            iterate.rodizioIsAtive = vehicleService.getRodizioAtive(iterate, LocalDate.now());
            array.add(iterate);
        }
        return array;
    }
}
