package com.example.springproject.mapper;

import com.example.springproject.dto.BlogDto;
import com.example.springproject.entity.Blog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogMapper {

    BlogDto toBlogDto(Blog blog);

    Blog toBlogEntity(BlogDto blogDto);
}
