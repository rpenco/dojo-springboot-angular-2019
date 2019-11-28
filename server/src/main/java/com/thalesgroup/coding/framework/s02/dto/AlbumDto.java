package com.thalesgroup.coding.framework.s02.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbumDto {
    private String name;

    private LocalDate creationDate;
}
