package com.prashant.post.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prashant.common.dto.PostDTO;
import com.prashant.post.domain.Post;
import com.prashant.post.repo.PostRepo;

@Service
public class PostService {
  @Autowired
  private PostRepo postRepo;

  @Transactional(readOnly = true)
  public PostDTO findPostById(Long postId) {
    Post post = postRepo.findById(postId).orElse(null);
    if (null == post) {
      return null;
    } else {

      return populatePostDTO(post);
    }
  }

  @Transactional
  public void savePost(Post post) {
    postRepo.save(post);
  }

  @Transactional(readOnly = true)
  public List<PostDTO> findAllPosts() {
    List<Post> posts = postRepo.findAll();
    return posts.stream().map(b -> populatePostDTO(b)).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public List<PostDTO> findPostsByBlogId(Long blogId) {
    List<Post> posts = postRepo.findPostByBlogId(blogId);
    return posts.stream().map(b -> populatePostDTO(b)).collect(Collectors.toList());
  }

  private PostDTO populatePostDTO(Post post) {
    PostDTO postDTO = new PostDTO();
    postDTO.setId(post.getId());
    postDTO.setTitle(post.getTitle());
    postDTO.setDescription(post.getDescription());
    postDTO.setContent(post.getContent());
    postDTO.setBlogId(post.getBlogId());
    return postDTO;
  }
}
