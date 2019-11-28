package com.prashant.blog.rest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prashant.common.dto.PostDTO;

@FeignClient(name = "post-service")
public interface PostClient {

  @GetMapping(value = "/blog/{blogId}")
  public ResponseEntity<List<PostDTO>> findPostWithBlogId(@PathVariable Long blogId);
}
