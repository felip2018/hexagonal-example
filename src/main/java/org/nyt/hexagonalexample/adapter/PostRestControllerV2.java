package org.nyt.hexagonalexample.adapter;

import org.nyt.hexagonalexample.application.service.PostService;
import org.nyt.hexagonalexample.application.service.impl.PostPgServiceImpl;
import org.nyt.hexagonalexample.domain.Post;
import org.nyt.hexagonalexample.port.in.PostRestUI;
import org.nyt.hexagonalexample.port.out.PostPgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/post")
public class PostRestControllerV2 implements PostRestUI {

    @Qualifier("POSTGRES")
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
