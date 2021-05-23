package com.cadu.vehicleapi.controller.DTO;

import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.controller.DTO.mapper.VehicleMapper;
import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.model.Vehicle;

public class VehiclesFromUserDTO {
    public String ownerName;
    public List<VehicleDTO> vehicles;

    public VehiclesFromUserDTO(List<Vehicle> vehicles, User user) throws Exception {
        this.vehicles = new ArrayList<VehicleDTO>();
        VehicleMapper mapper = new VehicleMapper();
        this.vehicles = mapper.convert(vehicles);
        this.ownerName = user.name;
    }
}
