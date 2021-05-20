package com.cadu.vehicleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.cadu.vehicleapi.model.User;

@RestController
public class UsersController {

    @GetMapping("/users")
    public List<User> listUsers() {
        User user = new User("Carlos", "CarlosEmail@email.com", 1234, LocalDate.now());
        User user2 = new User("Robson", "RobsonEmail@email.com", 4321, LocalDate.now());
        User user3 = new User("Amadeu", "AmadeuEmail@email.com", 3333, LocalDate.now());
        return Arrays.asList(user, user2, user3);
    }
}
