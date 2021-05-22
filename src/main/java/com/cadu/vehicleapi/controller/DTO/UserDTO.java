package com.cadu.vehicleapi.controller.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.model.User;

public class UserDTO {
    public String name;
    public String email;
    private int CPF;
    public LocalDate birthDate;

    public UserDTO(User user) {
        this.name = user.name;
        this.email = user.email;
        this.CPF = user.CPF;
        this.birthDate = user.birthDate;
    }

    public UserDTO() {

    }

    public List<UserDTO> convert(List<User> vehicles) {
        List<UserDTO> array = new ArrayList<UserDTO>();
        for (int i = 0; i < vehicles.size(); i++) {
            UserDTO iterate = new UserDTO();
            iterate.name = vehicles.get(i).name;
            iterate.email = vehicles.get(i).email;
            iterate.CPF = vehicles.get(i).CPF;
            iterate.birthDate = vehicles.get(i).birthDate;
            array.add(iterate);
        }
        return array;
    }
}
