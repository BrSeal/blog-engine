package main.repositories;

import main.dao.entities.ModerationStatus;
import main.dao.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository <Post, Integer> {
    int countPostByModerationStatus(ModerationStatus status);
}
