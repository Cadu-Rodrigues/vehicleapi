package com.cadu.vehicleapi.controller.DTO;

import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.model.Vehicle;

public class VehiclesFromUserDTO {
    public String ownerName;
    public List<VehicleDTO> vehicles;

    public VehiclesFromUserDTO(List<Vehicle> vehicles, User user) throws Exception {
        this.vehicles = new ArrayList<VehicleDTO>();
        for (int i = 0; i < vehicles.size(); i++) {
            VehicleDTO dto = new VehicleDTO();
            this.vehicles = dto.convert(vehicles);
        }
        this.ownerName = user.name;
    }
}
