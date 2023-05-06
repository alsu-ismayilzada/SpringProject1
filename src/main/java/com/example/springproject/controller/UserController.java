package com.example.springproject.controller;

import com.example.springproject.dto.UserDto;
import com.example.springproject.entity.User;
import com.example.springproject.maneger.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserManager userManager;

    private final Logger logger;

    public UserController(UserManager userManager) {
        this.userManager = userManager;
        this.logger = LoggerFactory.getLogger(UserController.class);
    }

    @GetMapping
    List<UserDto> findAll(@RequestParam(name = "page") int page,@RequestParam(name = "count") int count) {
        logger.info("Find all request accepted");
        return userManager.findAll(page,count);
    }

    @GetMapping("/{id}")
    UserDto findById(@PathVariable int id) {

        return userManager.findById(id);
    }

    @PostMapping("/add")
    void addUser(@RequestBody UserDto user) {
        userManager.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    void deleteUser(@PathVariable int id) {
        userManager.deleteUser(id);
    }
}