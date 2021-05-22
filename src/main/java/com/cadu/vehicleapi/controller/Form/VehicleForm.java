package com.cadu.vehicleapi.controller.Form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.repository.UsersRepository;

public class VehicleForm {
    @NotNull
    @NotEmpty
    public String brand;
    @NotNull
    @NotEmpty
    public String model;
    @NotNull
    @NotEmpty
    public String year;
    @NotNull
    public int ownerCPF;

    public Vehicle convert(VehicleForm form, UsersRepository repository) {
        User user = repository.findByCPF(form.ownerCPF);
        return new Vehicle(form.brand, form.model, form.year, "0", user);
    }
}
