package com.prashant.common.dto;

import java.util.Set;

/**
 * Blog DTO
 * @author prashant
 *
 */
public class BlogDTO {
  Long id;
  String author;
  String topic;

  Set<PostDTO> posts;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public Set<PostDTO> getPosts() {
    return posts;
  }

  public void setPosts(Set<PostDTO> posts) {
    this.posts = posts;
  }

}
