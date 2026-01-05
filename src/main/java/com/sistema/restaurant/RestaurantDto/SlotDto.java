package com.sistema.restaurant.RestaurantDto;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class SlotDto {
    private Long id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer seatsAvailable;
}
