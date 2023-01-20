package ma.fstt.post.post.controllers;

import ma.fstt.post.post.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends CrudRepository<Post, Long> {

}
