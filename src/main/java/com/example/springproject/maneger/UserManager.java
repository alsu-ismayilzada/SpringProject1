package com.example.springproject.maneger;
import com.example.springproject.entity.User;
import com.example.springproject.repository.UserRepository;
import com.example.springproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
@AllArgsConstructor
public class UserManager implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {

        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user) {
     userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {

        userRepository.deleteById(id);
    }
}
