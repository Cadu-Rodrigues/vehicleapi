package com.cadu.vehicleapi.controller.DTO.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.controller.DTO.VehicleDTO;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.service.VehicleService;

public class VehicleMapper {
    private VehicleService vehicleService = new VehicleService();

    public List<VehicleDTO> convert(List<Vehicle> vehicles) {
        List<VehicleDTO> array = new ArrayList<VehicleDTO>();
        vehicles.forEach(it -> {
            VehicleDTO iterate = new VehicleDTO();
            iterate.brand = it.brand;
            iterate.model = it.model;
            iterate.year = it.year;
            iterate.value = it.value;
            iterate.ownerCPF = it.owner.CPF;
            iterate.rodizioDay = vehicleService.getRodizioDay(it);
            iterate.rodizioIsAtive = vehicleService.getRodizioAtive(iterate, LocalDate.now());
            array.add(iterate);
        });
        return array;
    }

}
