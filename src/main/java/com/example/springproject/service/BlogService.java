package com.example.springproject.service;
import com.example.springproject.dto.BlogDto;
import com.example.springproject.entity.Blog;
import org.springframework.stereotype.Component;

@Component
public interface BlogService {

    BlogDto findById(int id);
    void addBlog(Blog blog);
    void deleteBlog(int id);
}
