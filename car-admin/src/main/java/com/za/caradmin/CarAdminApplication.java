package com.za.caradmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = MongoAutoConfiguration.class,scanBasePackages = {"com.za"})
@EnableDiscoveryClient
public class CarAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarAdminApplication.class, args);
    }

}
