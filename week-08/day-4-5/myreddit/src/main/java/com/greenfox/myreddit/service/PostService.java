package com.greenfox.myreddit.service;

import com.greenfox.myreddit.model.Post;
import com.greenfox.myreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {


    private PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Post createPost() {
        return new Post();
    }

    public void savePost(Post post) {
        repository.save(post);
    }

    public void upVotePost(Long id) {
        Post post = repository.findById(id).get();
        post.upVote();
        repository.save(post);
    }

    public void downVotePost(Long id) {
        Post post = repository.findById(id).get();
        post.downVote();
        repository.save(post);
    }

    public Post getPostById(Long id) {
        return repository.findById(id).get();
    }

    public List<Post> getOrderedPosts() {
        return repository.getOrderedPosts();
    }

}
