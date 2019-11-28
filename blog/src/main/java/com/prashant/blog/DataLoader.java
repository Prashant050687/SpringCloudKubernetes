package com.prashant.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prashant.blog.domain.Blog;
import com.prashant.blog.repo.BlogRepo;

/**
 * 
 *Data loader to load sample employee data into the database.
 * @author prashant
 *
 */
@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  BlogRepo blogRepo;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Blog blog = new Blog();
    blog.setAuthor("Prashant");
    blog.setId(1L);
    blog.setTopic("Microservices");

    blogRepo.save(blog);
  }

}
