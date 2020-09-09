package com.za.cargw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class CarGwApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarGwApplication.class, args);
    }

}
