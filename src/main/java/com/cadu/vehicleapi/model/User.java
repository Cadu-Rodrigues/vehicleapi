package com.cadu.vehicleapi.model;

import java.time.LocalDate;

public class User {
    public String name;
    public String email;
    public int CPF;
    public LocalDate birthDate;

    public User(String name, String email, int CPF, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.CPF = CPF;
        this.birthDate = birthDate;
    }
}
