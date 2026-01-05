package com.sistema.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestaurantServiceApplication {
    public static void main(String[] args) {
        // Corregido: Debe apuntar a RestaurantServiceApplication
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}