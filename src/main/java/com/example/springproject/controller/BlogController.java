package com.example.springproject.controller;
import com.example.springproject.entity.Blog;
import com.example.springproject.maneger.BlogManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BlogController {

    private final BlogManager blogManager;

    public BlogController(BlogManager blogManager) {
        this.blogManager = blogManager;
    }

    @GetMapping("/blogs/{id}")
    Blog findById(@PathVariable int id){
       return blogManager.findById(id);
    }
    @PostMapping("/blogs")
    void addBlog(Blog blog){
        blogManager.addBlog(blog);
    }
    @DeleteMapping("/blogs/delete/{id}")
    void deleteBlog(@PathVariable int id){
        blogManager.deleteBlog(id);
    }
}
