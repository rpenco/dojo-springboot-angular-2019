package com.thalesgroup.coding.framework.s02.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ArtistDto {
    private String name;
    private String firstname;
    private LocalDate birthday;
    private String country;
    private String category;

}
