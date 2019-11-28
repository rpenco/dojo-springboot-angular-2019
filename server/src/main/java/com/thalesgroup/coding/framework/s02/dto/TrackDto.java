package com.thalesgroup.coding.framework.s02.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class TrackDto {
    private String name;
    private LocalTime time;
    private LocalDate creationDate;
    private String albumId;
}
