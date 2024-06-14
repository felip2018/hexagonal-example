package org.nyt.hexagonalexample.application.service.impl;

import org.nyt.hexagonalexample.application.service.PostService;
import org.nyt.hexagonalexample.domain.Post;
import org.nyt.hexagonalexample.port.out.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MEMORY")
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public void createPost(Post post) {
        postRepository.createPost(post);
    }

    @Override
    public Post getPost(Long postId) {
        return postRepository.getPost(postId);
    }

    @Override
    public List<Post> listPosts() {
        return postRepository.getAllPosts();
    }
}
