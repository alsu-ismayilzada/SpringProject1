package com.example.springproject.controller;
import com.example.springproject.entity.User;
import com.example.springproject.maneger.UserManager;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api")
public class UserController {
   private final UserManager userManager;
    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }
    @GetMapping("/users")
    List<User> findAll(){
        return userManager.findAll();
    }
    @GetMapping("/users/{id}")
    User findById(@PathVariable int id){
        return userManager.findById(id-1);
    }
    @PostMapping("/user")
    void addUser(@RequestBody User user){
        userManager.addUser(user);
    }
    @DeleteMapping("/delete/{id}")
    void deleteUser(@PathVariable int id){
        userManager.deleteUser(id-1);
    }
}