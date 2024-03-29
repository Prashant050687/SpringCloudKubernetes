package com.prashant.common.dto;

/**
 * 
 * @author prashant
 *
 */
public class PostDTO {
  Long id;
  String title;
  String description;
  String content;
  Long blogId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Long getBlogId() {
    return blogId;
  }

  public void setBlogId(Long blogId) {
    this.blogId = blogId;
  }

}
