package com.cadu.vehicleapi;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import com.cadu.vehicleapi.controller.DTO.VehicleDTO;
import com.cadu.vehicleapi.model.User;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.service.VehicleService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VehicleServiceTests {
	private VehicleService service = new VehicleService();

	@Test
	void shouldReturnTrueWhenIsRodizioDay() throws Exception {
		User user = new User("Carlos", "carlosEmail@email.com", 1234, LocalDate.parse("2000-04-13"));
		Vehicle vehicle = new Vehicle("ford", "fiesta", "2006", "9000", user);
		VehicleDTO vehicleDTO = new VehicleDTO(vehicle);
		assertTrue(service.getRodizioAtive(vehicleDTO, LocalDate.parse("2021-05-20")));
	}

	@Test
	void shouldReturnFalseWhenIsNotRodizioDay() throws Exception {
		User user = new User("Carlos", "carlosEmail@email.com", 1234, LocalDate.parse("2000-04-13"));
		Vehicle vehicle = new Vehicle("ford", "fiesta", "2006", "9000", user);
		VehicleDTO vehicleDTO = new VehicleDTO(vehicle);
		assertFalse(service.getRodizioAtive(vehicleDTO, LocalDate.parse("2021-05-21")));
	}

}
