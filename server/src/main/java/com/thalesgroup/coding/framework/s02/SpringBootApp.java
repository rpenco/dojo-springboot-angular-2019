package com.thalesgroup.coding.framework.s02;

import com.sun.research.ws.wadl.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
