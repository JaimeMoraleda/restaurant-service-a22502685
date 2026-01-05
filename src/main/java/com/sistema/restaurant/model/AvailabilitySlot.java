package com.sistema.restaurant.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "availability_slots")
@Data
public class AvailabilitySlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    private LocalDate slotDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer capacity;
    private Integer seatsAvailable;
}

