package com.sistema.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "menu_items")
@Data
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    private String name;
    private String description;
    private BigDecimal price; // Debe ser mayor a cero según reglas
    private String currency;
    private boolean active;
}

