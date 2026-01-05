package com.sistema.restaurant.service;

import com.sistema.restaurant.model.Restaurant;
import com.sistema.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository repository;

    public List<Restaurant> findAll() {
        return repository.findAll();
    }

    public Restaurant findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));
    }
}