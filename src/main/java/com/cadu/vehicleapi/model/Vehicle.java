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
    public int year;
    public long value;
    @ManyToOne
    public User owner;

    public Vehicle() {
    }

}
