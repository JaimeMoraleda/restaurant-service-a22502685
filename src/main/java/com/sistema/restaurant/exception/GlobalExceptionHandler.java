package com.sistema.restaurant.exception;

import com.sistema.restaurant.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.UUID;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public org.springframework.http.ResponseEntity<ErrorResponse> handleAll(Exception ex) {
        ErrorResponse error = new ErrorResponse(
                "INTERNAL_ERROR",
                ex.getMessage(),
                UUID.randomUUID().toString() // Generamos el traceId obligatorio
        );
        return new org.springframework.http.ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

