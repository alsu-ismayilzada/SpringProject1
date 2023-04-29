package com.example.springproject.maneger;
import com.example.springproject.entity.Blog;
import com.example.springproject.repository.BlogRepository;
import com.example.springproject.service.BlogService;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BlogManager implements BlogService {

    private BlogRepository blogRepository;
    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(int id) {
       blogRepository.deleteById(id);
    }
}
