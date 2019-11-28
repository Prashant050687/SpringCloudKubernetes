package com.prashant.post.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashant.post.domain.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
  public List<Post> findPostByBlogId(Long blogId);
}
