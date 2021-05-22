package com.cadu.vehicleapi.controller;

import java.util.List;

import com.cadu.vehicleapi.controller.DTO.UserDTO;
import com.cadu.vehicleapi.controller.DTO.VehicleDTO;
import com.cadu.vehicleapi.controller.DTO.VehiclesFromUserDTO;
import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.repository.UsersRepository;
import com.cadu.vehicleapi.repository.VehiclesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesFromUserController {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private VehiclesRepository vehiclesRepository;

    @GetMapping("/vehiclesUser/{cpf}")
    public VehiclesFromUserDTO listVehiclesUser(@PathVariable int cpf) {
        UserDTO dto = new UserDTO();
        User user = usersRepository.findByCPF(cpf);
        List<Vehicle> vehicles = vehiclesRepository.findByOwner_CPF(cpf);
        VehiclesFromUserDTO result = new VehiclesFromUserDTO(vehicles, user);
        return result;
    }
}
