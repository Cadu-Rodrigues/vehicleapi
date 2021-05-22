package com.cadu.vehicleapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String brand;
    public String model;
    public String year;
    public String value;
    @ManyToOne
    public User owner;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String year, String value, User owner) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.value = value;
        this.owner = owner;
    }

}
