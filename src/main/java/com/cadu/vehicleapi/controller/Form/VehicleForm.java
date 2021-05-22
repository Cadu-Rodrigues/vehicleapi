package com.cadu.vehicleapi.controller.Form;

import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.repository.UsersRepository;

public class VehicleForm {
    public String brand;
    public String model;
    public int year;
    public long value;
    public int ownerCPF;

    public Vehicle convert(VehicleForm form, UsersRepository repository) {
        User user = repository.findByCPF(form.ownerCPF);
        return new Vehicle(form.brand, form.model, form.year, form.value, user);
    }
}
