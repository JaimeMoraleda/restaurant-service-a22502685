package com.sistema.restaurant.service;

import com.sistema.restaurant.model.AvailabilitySlot;
import com.sistema.restaurant.repository.AvailabilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AvailabilityService {
    private final AvailabilityRepository repository;

    public List<AvailabilitySlot> checkAvailability(Long restaurantId, LocalDate date) {
        // Regla: Solo fechas futuras (simplificado para la consulta)
        return repository.findByRestaurantIdAndSlotDate(restaurantId, date);
    }

    @Transactional
    public void releaseSeats(Long restaurantId, int partySize) {
        // En un sistema real buscaríamos el slot específico.
        // Para este ejercicio, actualizamos el primer slot disponible del restaurante.
        List<AvailabilitySlot> slots = repository.findByRestaurantIdAndSlotDate(restaurantId, LocalDate.now().plusDays(1));
        if (!slots.isEmpty()) {
            AvailabilitySlot slot = slots.get(0);
            slot.setSeatsAvailable(slot.getSeatsAvailable() + partySize);
            repository.save(slot);
        }
    }
}
