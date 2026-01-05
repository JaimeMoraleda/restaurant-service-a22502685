package com.sistema.restaurant.repository;

import com.sistema.restaurant.model.AvailabilitySlot;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface AvailabilityRepository extends JpaRepository<AvailabilitySlot, Long> {
    List<AvailabilitySlot> findByRestaurantIdAndSlotDate(Long restaurantId, LocalDate date);
}

