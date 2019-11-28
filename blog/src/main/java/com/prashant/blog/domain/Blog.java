package com.prashant.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DynamicUpdate(true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "BLOG")
public class Blog {
  @Id
  @Column(name = "id")
  Long id;
  @Column(name = "author")
  String author;
  @Column(name = "topic")
  String topic;

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

}
