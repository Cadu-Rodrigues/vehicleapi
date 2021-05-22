package com.cadu.vehicleapi.controller.Form;

import java.time.LocalDate;

import com.cadu.vehicleapi.model.User;

public class UserForm {
    public String name;
    public String email;
    private int CPF;
    public LocalDate birthDate;

    public User convert(UserForm form) {
        return new User(form.name, form.email, form.CPF, form.birthDate);
    }
}
