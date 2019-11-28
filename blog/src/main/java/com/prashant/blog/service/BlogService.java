package com.prashant.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prashant.blog.domain.Blog;
import com.prashant.blog.repo.BlogRepo;
import com.prashant.common.dto.BlogDTO;
import com.prashant.common.exception.BusinessException;

@Service
public class BlogService {
  @Autowired
  private BlogRepo blogRepo;

  @Transactional(readOnly = true)
  public BlogDTO findBlogById(Long blogId) {
    Blog blog = blogRepo.findById(blogId).orElse(null);
    if (null == blog) {
      throw new BusinessException("Entity Not Found", "Entity with Id" + blogId + " Not found");
    } else {

      return populateBlogDTO(blog);
    }
  }

  @Transactional
  public void saveBlog(Blog blog) {
    blogRepo.save(blog);
  }

  @Transactional(readOnly = true)
  public List<BlogDTO> findAllBlogs() {
    List<Blog> blogs = blogRepo.findAll();
    return blogs.stream().map(b -> populateBlogDTO(b)).collect(Collectors.toList());
  }

  private BlogDTO populateBlogDTO(Blog blog) {
    BlogDTO blogDTO = new BlogDTO();
    blogDTO.setId(blog.getId());
    blogDTO.setAuthor(blog.getAuthor());
    blogDTO.setTopic(blog.getTopic());
    return blogDTO;
  }
}
