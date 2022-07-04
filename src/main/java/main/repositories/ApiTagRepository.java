package main.repositories;


import main.dao.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApiTagRepository extends JpaRepository<Tag, Long> {

    List<Tag> findByNameStartingWith(String query);

    List<Tag> findAll(List<String> tagList);

    List<Tag> findById(List<Long> ids);

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM be.tag2post p WHERE tag_id = :tagId")
    int findTagLinks(int tagId);


    @Query(nativeQuery = true, value = "SELECT name FROM be.tag2post "
            + "JOIN be.tag ON be.tag2post.tag_id = be.tag_id WHERE post_id = :postId")
    String[] findByPostId(int postId);
}
