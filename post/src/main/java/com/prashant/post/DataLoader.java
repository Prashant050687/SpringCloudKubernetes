package com.prashant.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prashant.post.domain.Post;
import com.prashant.post.repo.PostRepo;

/**
 * 
 *Data loader to load sample employee data into the database.
 * @author prashant
 *
 */
@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  PostRepo postRepo;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Post post = new Post();
    post.setBlogId(1L);
    post.setContent("Content");
    post.setDescription("Description");
    post.setTitle("Title");

    postRepo.save(post);
  }

}
