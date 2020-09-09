package com.za.carcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = MongoAutoConfiguration.class,scanBasePackages = {"com.za"})
@EnableDiscoveryClient
public class CarCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarCustomerApplication.class, args);
    }

}
