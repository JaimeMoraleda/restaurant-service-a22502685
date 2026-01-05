package com.sistema.restaurant.controller;

import com.sistema.restaurant.model.AvailabilitySlot;
import com.sistema.restaurant.service.AvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class AvailabilityController {
    private final AvailabilityService availabilityService;

    @GetMapping("/{id}/availability")
    public List<AvailabilitySlot> getAvailability(
            @PathVariable Long id,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return availabilityService.checkAvailability(id, date);
    }

    @PostMapping("/{id}/availability/release")
    public void releaseSeats(@PathVariable Long id, @RequestBody java.util.Map<String, Integer> request) {
        availabilityService.releaseSeats(id, request.get("partySize"));
    }
}

