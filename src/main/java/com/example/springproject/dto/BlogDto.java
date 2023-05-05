package com.example.springproject.dto;
import com.example.springproject.entity.User;
public record BlogDto(
        String name,
        String definition,
        String author,
        User user) {

}
