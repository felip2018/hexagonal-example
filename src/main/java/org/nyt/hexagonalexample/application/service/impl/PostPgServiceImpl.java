package org.nyt.hexagonalexample.application.service.impl;

import org.nyt.hexagonalexample.application.service.PostService;
import org.nyt.hexagonalexample.domain.Post;
import org.nyt.hexagonalexample.port.out.PostPgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("POSTGRES")
public class PostPgServiceImpl implements PostService {

    @Autowired
    PostPgRepository postPgRepository;

    @Override
    public void createPost(Post post) {
        postPgRepository.save(post);
    }

    @Override
    public Post getPost(Long postId) {
        return postPgRepository.findById(postId).orElse(null);
    }

    @Override
    public List<Post> listPosts() {
        return postPgRepository.findAll().stream().collect(Collectors.toList());
    }

}
