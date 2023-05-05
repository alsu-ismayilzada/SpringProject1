package com.example.springproject.exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound(String massage) {
        super(massage);
    }
}
