package com.cadu.vehicleapi.model;

public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public long value;
    private int ownerCPF;

    public Vehicle(String brand, String model, int year, long value, int ownerCPF) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.value = value;
        this.ownerCPF = ownerCPF;
    }

    public int getOwnerCpf() {
        return this.ownerCPF;
    }

}
