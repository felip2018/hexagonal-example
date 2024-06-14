package org.nyt.hexagonalexample.port.in;

import org.nyt.hexagonalexample.domain.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/*
Puerto de entrada que expone la lógica central al mundo exterior
 */
public interface PostRestUI {

    @PostMapping
    void createPost(@RequestBody Post post);

    @GetMapping("/{postId}")
    Post getPost(@PathVariable Long postId);

    @GetMapping
    List<Post> listPosts();
}
