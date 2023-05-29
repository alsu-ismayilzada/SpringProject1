package com.example.springproject.exception;

import java.time.LocalDateTime;

public record GeneralExceptionDetails(
        LocalDateTime localDateTime,
        String massage,
        String description) {
}
