package com.cadu.vehicleapi.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;
    public String email;
    public int CPF;
    public LocalDate birthDate;
    @OneToMany(mappedBy = "owner")
    public List<Vehicle> vehicles;

    public User() {

    }
}
