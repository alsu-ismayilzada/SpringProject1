package com.example.springproject.service;
import com.example.springproject.dto.UserDto;
import com.example.springproject.entity.User;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public interface UserService {

    List<UserDto> findAll();
    UserDto findById(int id);
    void addUser(User user);
    void deleteUser(int id);

}
