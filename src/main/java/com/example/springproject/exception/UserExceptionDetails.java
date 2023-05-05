package com.example.springproject.exception;

import java.time.LocalDateTime;

public record UserExceptionDetails(

        LocalDateTime localDateTime,
        String massage,
        String description) {

}
