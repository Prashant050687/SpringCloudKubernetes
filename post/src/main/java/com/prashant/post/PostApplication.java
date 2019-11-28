package com.prashant.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.prashant.post"})
@EntityScan(basePackages = "com.prashant.post.domain")
@EnableJpaRepositories(basePackages = "com.prashant.post.repo")
// To enable the microservice to be discovered within kubernetes
@EnableDiscoveryClient
public class PostApplication {

  public static void main(String[] args) {
    SpringApplication.run(PostApplication.class, args);
  }

}
