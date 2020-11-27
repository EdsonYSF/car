package com.za.carwechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = MongoAutoConfiguration.class,scanBasePackages = {"com.za"})
@EnableDiscoveryClient
@EnableScheduling
public class CarWechatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarWechatApplication.class, args);
    }

}
