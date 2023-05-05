package com.example.springproject.exception;

public class BlogNotFound extends RuntimeException{
    public BlogNotFound(String massage) {
        super(massage);
    }
}
