package com.cadu.vehicleapi.repository;

import com.cadu.vehicleapi.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {

    User findByCPF(int cpf);

}
