package com.cadu.vehicleapi.controller.DTO.mapper;

import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.controller.DTO.UserDTO;
import com.cadu.vehicleapi.model.User;

public class UserMapper {
    public List<UserDTO> convert(List<User> vehicles) {
        List<UserDTO> array = new ArrayList<UserDTO>();
        vehicles.forEach(it -> {
            UserDTO iterate = new UserDTO();
            iterate.name = it.name;
            iterate.email = it.email;
            iterate.CPF = it.CPF;
            iterate.birthDate = it.birthDate;
            array.add(iterate);
        });
        return array;
    }
}
