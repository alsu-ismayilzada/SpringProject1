package com.example.springproject.mapper;
import com.example.springproject.dto.UserDto;
import com.example.springproject.entity.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);
    User toUserEntity(UserDto userDto);
}
