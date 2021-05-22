package com.cadu.vehicleapi.validation.DTO;

public class FormErrorDTO {
    public String field;
    public String error;

    public FormErrorDTO(String field, String error) {
        this.field = field;
        this.error = error;
    }
}
