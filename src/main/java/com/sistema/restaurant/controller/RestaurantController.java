package com.sistema.restaurant.controller;

import com.sistema.restaurant.model.Restaurant;
import com.sistema.restaurant.service.RestaurantService; // Importación correcta
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService service;

    @GetMapping
    public List<Restaurant> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable Long id) {
        return service.findById(id);
    }
}