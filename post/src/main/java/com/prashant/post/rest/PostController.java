package com.prashant.post.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.common.dto.PostDTO;
import com.prashant.post.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

  @Autowired
  private PostService postService;

  @GetMapping(value = "/all")
  public ResponseEntity<List<PostDTO>> findAllPosts() {
    return ResponseEntity.ok(postService.findAllPosts());

  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<PostDTO> findPosById(@PathVariable Long id) {
    return ResponseEntity.ok(postService.findPostById(id));

  }

  @GetMapping(value = "/blog/{blogId}")
  public ResponseEntity<List<PostDTO>> findPostWithBlogId(@PathVariable Long blogId) {
    return ResponseEntity.ok(postService.findPostsByBlogId(blogId));

  }
}
