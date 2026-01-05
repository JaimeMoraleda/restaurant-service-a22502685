package com.sistema.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "restaurants")
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String country;
    private String phone;
    private String email;
}

