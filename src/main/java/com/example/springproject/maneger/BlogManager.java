package com.example.springproject.maneger;
import com.example.springproject.dto.BlogDto;
import com.example.springproject.exception.NotFound;
import com.example.springproject.mapper.BlogMapper;
import com.example.springproject.repository.BlogRepository;
import com.example.springproject.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BlogManager implements BlogService {

    private BlogRepository blogRepository;
    private final BlogMapper blogMapper;
    @Override
    public BlogDto findById(int id) {
        return blogRepository.findById(id)
                .stream().map(blogMapper::toBlogDto)
                .findFirst().orElseThrow(()->new NotFound("Blog tapilmadi!!"));
    }

    @Override
    public void addBlog(BlogDto blog) {
        blogRepository.save(blogMapper.toBlogEntity(blog));
    }

    @Override

    public void deleteBlog(int id) {
       blogRepository.deleteById(id);
    }
}
