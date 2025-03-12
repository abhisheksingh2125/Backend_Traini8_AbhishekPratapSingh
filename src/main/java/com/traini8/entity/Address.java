package com.traini8.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Embeddable
public class Address {
    @NotBlank
    private String detailedAddress;
    
    @NotBlank
    private String city;
    
    @NotBlank
    private String state;
    
    @NotBlank
    @Pattern(regexp = "^[0-9]{6}$")
    private String pincode;
}
