package com.example.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(ClientAppApplication.class, args);
    }

}
