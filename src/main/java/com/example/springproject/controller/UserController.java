package com.example.springproject.controller;
import com.example.springproject.dto.UserDto;
import com.example.springproject.entity.User;
import com.example.springproject.maneger.UserManager;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {
   private final UserManager userManager;
    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }
    @GetMapping("")
    List<UserDto> findAll(){
        return userManager.findAll();
    }
    @GetMapping("/{id}")
    UserDto findById(@PathVariable int id){
        return userManager.findById(id);
    }
    @PostMapping("/add")
    void addUser(@RequestBody UserDto user){
        userManager.addUser(user);
    }
    @DeleteMapping("/delete/{id}")
    void deleteUser(@PathVariable int id){
        userManager.deleteUser(id);
    }
}