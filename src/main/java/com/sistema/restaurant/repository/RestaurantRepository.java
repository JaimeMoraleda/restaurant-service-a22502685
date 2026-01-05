package com.sistema.restaurant.repository;

import com.sistema.restaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}

