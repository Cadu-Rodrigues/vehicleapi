package com.cadu.vehicleapi.controller.DTO;

import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.model.Vehicle;

public class VehicleDTO {
    public String brand;
    public String model;
    public int year;
    public long value;
    public int ownerCPF;

    public List<VehicleDTO> convert(List<Vehicle> vehicles) {
        List<VehicleDTO> array = new ArrayList<VehicleDTO>();
        for (int i = 0; i < vehicles.size(); i++) {
            VehicleDTO iterate = new VehicleDTO();
            iterate.brand = vehicles.get(i).brand;
            iterate.model = vehicles.get(i).model;
            iterate.year = vehicles.get(i).year;
            iterate.value = vehicles.get(i).value;
            iterate.ownerCPF = vehicles.get(i).ownerCPF;
            array.add(iterate);
        }
        return array;
    }
}