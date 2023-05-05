package com.example.springproject.maneger;
import com.example.springproject.dto.BlogDto;
import com.example.springproject.entity.Blog;
import com.example.springproject.exception.BlogNotFound;
import com.example.springproject.repository.BlogRepository;
import com.example.springproject.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BlogManager implements BlogService {

    private BlogRepository blogRepository;
    @Override
    public BlogDto findById(int id) {
        return blogRepository.findById(id)
                .stream().map(blog -> new BlogDto(blog.getName(),blog.getDefinition(),blog.getAuthor(),blog.getUser()))
                .findFirst().orElseThrow(()->new BlogNotFound("Blog tapilmadi!!"));
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
