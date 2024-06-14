package org.nyt.hexagonalexample.port.out;

import org.nyt.hexagonalexample.domain.Post;

import java.util.List;

/**
 * Puerto de salida: crea una interfaz para crear o acceder al mundo exterior, es decir, Cake
 */
public interface PostRepository {

    public void createPost(Post post);

    public Post getPost(Long postId);

    public List<Post> getAllPosts();

}
