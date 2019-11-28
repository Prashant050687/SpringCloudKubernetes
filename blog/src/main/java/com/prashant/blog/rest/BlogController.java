package com.prashant.blog.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.blog.service.BlogService;
import com.prashant.common.dto.BlogDTO;
import com.prashant.common.dto.PostDTO;

@RestController
@RequestMapping("/blog")
public class BlogController {

  @Autowired
  private BlogService blogService;

  @Autowired
  private PostClient postClient;

  @GetMapping(value = "/all")
  public ResponseEntity<List<BlogDTO>> findAllBlogs() {
    return ResponseEntity.ok(blogService.findAllBlogs());

  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<BlogDTO> findBlogWithBlogId(@PathVariable Long id) {

    BlogDTO blogDTO = blogService.findBlogById(id);
    // Making inter-service calls using Feign client
    ResponseEntity<List<PostDTO>> postsResponse = postClient.findPostWithBlogId(id);
    blogDTO.setPosts(postsResponse.getBody());

    return ResponseEntity.ok(blogService.findBlogById(id));

  }
}
