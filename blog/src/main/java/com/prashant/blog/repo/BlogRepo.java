package com.prashant.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashant.blog.domain.Blog;

public interface BlogRepo extends JpaRepository<Blog, Long> {

}
