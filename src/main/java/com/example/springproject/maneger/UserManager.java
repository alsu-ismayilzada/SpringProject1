package com.example.springproject.maneger;
import com.example.springproject.dto.UserDto;
import com.example.springproject.entity.User;
import com.example.springproject.exception.UserNotFound;
import com.example.springproject.mapper.UserMapper;
import com.example.springproject.repository.UserRepository;
import com.example.springproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
@AllArgsConstructor
public class UserManager implements UserService {

    private UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public List<UserDto> findAll() {

        return userRepository.findAll()
                .stream().map(userMapper::toUserDto)
                .toList();
    }
    @Override
    public UserDto findById(int id) {

        return userRepository.findById(id)
                .stream().map(userMapper::toUserDto)
                .findFirst().orElseThrow(()->new UserNotFound("User tapilmadi!!"));
    }


    @Override
    public void addUser(UserDto user) {
     userRepository.save(userMapper.toUserEntity(user));
    }

    @Override
    public void deleteUser(int id) {

        userRepository.deleteById(id);
    }
}
