package org.nyt.hexagonalexample.application.service;

import org.nyt.hexagonalexample.domain.Post;

import java.util.List;

/**
 * Definir una interfaz a través de la cual nuestra aplicación principal permitirá
 * su comunicación. Expone la aplicación principal al mundo exterior
 */

public interface PostService {

    public void createPost(Post post);

    public Post getPost(Long postId);

    public List<Post> listPosts();

}
