package com.example.springproject.exception;

import java.time.LocalDateTime;

public record BlogExceptionDetails(

        LocalDateTime localDateTime,
        String massage,
        String description) {

}