package com.sistema.restaurant.dto; // Paquete corregido para que coincida con la carpeta

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String error;
    private String message;
    private String traceId;
}