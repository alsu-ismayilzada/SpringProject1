package com.example.springproject.exception;

public class NotFound extends RuntimeException{
    public NotFound(String massage) {
        super(massage);
    }
}
