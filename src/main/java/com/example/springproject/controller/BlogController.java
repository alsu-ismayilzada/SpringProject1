package com.example.springproject.controller;
import com.example.springproject.dto.BlogDto;
import com.example.springproject.entity.Blog;
import com.example.springproject.maneger.BlogManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
    private final BlogManager blogManager;
    public BlogController(BlogManager blogManager) {
        this.blogManager = blogManager;
    }
    @GetMapping("/{id}")
    BlogDto findById(@PathVariable int id){
       return blogManager.findById(id);
    }
    @PostMapping("/add")
    void addBlog(@RequestBody BlogDto blog){
        blogManager.addBlog(blog);
    }
    @DeleteMapping("/delete/{id}")
    void deleteBlog(@PathVariable int id){
        blogManager.deleteBlog(id);
    }
}
