package com.sistema.restaurant.repository;

import com.sistema.restaurant.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}

