package main.api.post;

import main.dao.entities.ModerationStatus;
import main.dao.entities.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    int countPostByModerationStatus(ModerationStatus status);
}
