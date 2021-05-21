package com.cadu.vehicleapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.cadu.vehicleapi.controller.DTO.UserDTO;
import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.repository.UsersRepository;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository repository;

    @GetMapping("/users")
    public List<UserDTO> listUsers() {
        List<User> users = repository.findAll();
        UserDTO dto = new UserDTO();
        return dto.convert(users);
    }
}
