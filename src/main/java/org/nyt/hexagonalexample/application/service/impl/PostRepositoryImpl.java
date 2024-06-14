package org.nyt.hexagonalexample.application.service.impl;

import org.nyt.hexagonalexample.domain.Post;
import org.nyt.hexagonalexample.port.out.PostRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Adapatador secundario, es la implementación de un puerto de salida
 */
@Repository
public class PostRepositoryImpl implements PostRepository {

    private Map<Long, Post> postStore = new HashMap<>();

    @Override
    public void createPost(Post post) {
        postStore.put(post.getId(), post);
    }

    @Override
    public Post getPost(Long postId) {
        return postStore.get(postId);
    }

    @Override
    public List<Post> getAllPosts() {
        return postStore.values().stream().collect(Collectors.toList());
    }
}
