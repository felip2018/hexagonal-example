package org.nyt.hexagonalexample.adapter;

import org.nyt.hexagonalexample.application.service.PostService;
import org.nyt.hexagonalexample.domain.Post;
import org.nyt.hexagonalexample.port.in.PostRestUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Adaptador principal que proporciona los endpoints para crear y recuperar los recursos
 */
@RestController
@RequestMapping("/v1/post")
public class PostRestController implements PostRestUI {

    @Qualifier("MEMORY")
    @Autowired
    PostService postService;

    @Override
    public void createPost(Post post) {
        postService.createPost(post);
    }

    @Override
    public Post getPost(Long postId) {
        return postService.getPost(postId);
    }

    @Override
    public List<Post> listPosts() {
        return postService.listPosts();
    }
}
