package com.thalesgroup.coding.framework.s02.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.UUID;

@Entity
@Data
public class Artist {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String firstname;

    @Column(nullable = true)
    private Date birthday;

    @Column(nullable = true)
    private String country;

    @Column(nullable = true)
    private String category;

}
