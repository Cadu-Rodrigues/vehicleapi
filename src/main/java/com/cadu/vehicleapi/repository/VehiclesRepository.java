package com.cadu.vehicleapi.repository;

import java.util.List;

import com.cadu.vehicleapi.model.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByOwnerCPF(int cpf);

}
