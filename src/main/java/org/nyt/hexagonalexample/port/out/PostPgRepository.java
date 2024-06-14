package org.nyt.hexagonalexample.port.out;

import org.nyt.hexagonalexample.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostPgRepository extends JpaRepository<Post, Long> {
}
