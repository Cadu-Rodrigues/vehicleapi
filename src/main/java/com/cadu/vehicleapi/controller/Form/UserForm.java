package com.cadu.vehicleapi.controller.Form;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.cadu.vehicleapi.model.User;

public class UserForm {
    @NotNull
    @NotEmpty
    public String name;
    @NotNull
    @NotEmpty
    @Email
    public String email;
    @NotNull
    private int CPF;
    @NotNull
    public LocalDate birthDate;

    public User convert(UserForm form) {
        return new User(form.name, form.email, form.CPF, form.birthDate);
    }
}
