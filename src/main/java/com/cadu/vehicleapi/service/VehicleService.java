package com.cadu.vehicleapi.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;

import com.cadu.vehicleapi.controller.DTO.VehicleDTO;
import com.cadu.vehicleapi.model.Vehicle;
import com.cadu.vehicleapi.service.model.Brand;
import com.cadu.vehicleapi.service.model.FipeReturnValue;
import com.cadu.vehicleapi.service.model.Model;
import com.cadu.vehicleapi.service.model.ModelAndYear;
import com.cadu.vehicleapi.service.model.Year;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class VehicleService {
    RestTemplate restTemplate = new RestTemplate();

    public String getVehicleValue(Vehicle vehicle) {
        String brandCode = "";
        String modelCode = "";
        String year = "";
        try {
            brandCode = getBrandCode(vehicle.brand);
            modelCode = getModelCode(brandCode, vehicle.model);
            year = getYear(brandCode, modelCode, vehicle.year);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        String url = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + brandCode + "/modelos/" + modelCode
                + "/anos/" + year;
        FipeReturnValue result = restTemplate.getForObject(url, FipeReturnValue.class);
        return result.Valor;
    }

    public String getBrandCode(String brandName) throws Exception {
        String result = "";
        if (brandName == "")
            throw new Exception("Brand name cant be NULL");
        ResponseEntity<Brand[]> response = this.restTemplate
                .getForEntity("https://parallelum.com.br/fipe/api/v1/carros/marcas", Brand[].class);
        Brand brands[] = response.getBody();
        for (int i = 0; i < brands.length; i++) {
            if (brands[i].nome.equals(brandName))
                result = brands[i].codigo;
        }
        return result;
    }

    public String getModelCode(String brandCode, String modelName) throws Exception {
        String result = "";
        String URL = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + brandCode + "/modelos";
        if (brandCode == "")
            throw new Exception("Brand code cant be NULL");
        if (modelName == "")
            throw new Exception("Model name cant be NULL");
        ModelAndYear response = this.restTemplate.getForObject(URL, ModelAndYear.class);
        Model models[] = response.modelos;
        for (int i = 0; i < models.length; i++) {
            if (models[i].nome.equals(modelName))
                result = String.valueOf(models[i].codigo);
        }
        return result;
    }

    public String getYear(String brandCode, String modelCode, String carYear) throws Exception {
        String result = "";
        String URL = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + brandCode + "/modelos/" + modelCode
                + "/anos";
        if (brandCode == "")
            throw new Exception("Brand code cant be NULL");
        if (modelCode == "")
            throw new Exception("Model code cant be NULL");
        if (carYear == "")
            throw new Exception("Car year cant be NULL");
        ResponseEntity<Year[]> response = this.restTemplate.getForEntity(URL, Year[].class);
        Year years[] = response.getBody();
        for (int i = 0; i < years.length; i++) {
            if (years[i].nome.equals(carYear))
                result = years[i].codigo;
        }
        return result;
    }

    public String getRodizioDay(Vehicle vehicle) throws Exception {
        String words[] = vehicle.year.split(" ");
        String year = words[0];
        if (year.substring(year.length() - 1).equals("0") || year.substring(year.length() - 1).equals("1"))
            return DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, LocaleContextHolder.getLocale());
        if (year.substring(year.length() - 1).equals("2") || year.substring(year.length() - 1).equals("3"))
            return DayOfWeek.TUESDAY.getDisplayName(TextStyle.FULL, LocaleContextHolder.getLocale());
        if (year.substring(year.length() - 1).equals("4") || year.substring(year.length() - 1).equals("5"))
            return DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.FULL, LocaleContextHolder.getLocale());
        if (year.substring(year.length() - 1).equals("6") || year.substring(year.length() - 1).equals("7"))
            return DayOfWeek.THURSDAY.getDisplayName(TextStyle.FULL, LocaleContextHolder.getLocale());
        if (year.substring(year.length() - 1).equals("8") || year.substring(year.length() - 1).equals("9"))
            return DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, LocaleContextHolder.getLocale());
        throw new Exception("Vehicle has an invalid year: " + vehicle.year);
    }

    public Boolean getRodizioAtive(VehicleDTO vehicle, LocalDate now) {
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        if (dayOfWeek.getDisplayName(TextStyle.FULL, LocaleContextHolder.getLocale()).equals(vehicle.rodizioDay))
            return true;
        return false;
    }

}
