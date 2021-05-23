package com.cadu.vehicleapi.controller.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cadu.vehicleapi.model.User;

public class UserDTO {
    public String name;
    public String email;
    public int CPF;
    public LocalDate birthDate;

    public UserDTO(User user) {
        this.name = user.name;
        this.email = user.email;
        this.CPF = user.CPF;
        this.birthDate = user.birthDate;
    }

    public UserDTO() {

    }

}
