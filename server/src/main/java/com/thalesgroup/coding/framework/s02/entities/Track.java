package com.thalesgroup.coding.framework.s02.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalTime;
import java.util.UUID;

public class Track {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column
    private LocalTime time;

    @Column
    private Date creationDate;

    @Column
    private UUID albumId;
}
