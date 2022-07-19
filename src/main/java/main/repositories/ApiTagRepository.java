package main.repositories;


import main.dao.entities.Tag;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ApiTagRepository extends JpaRepository<Tag, Long> {

    List<Tag> findByNameStartingWith(String query);

    @NotNull
    List<Tag> findAll();

    @NotNull
    Optional<Tag> findById(@NotNull Long id);

    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM be.tag2post p WHERE tag_id = :tagId")
    int countTagLinks(int tagId);

    /**
     * Т.к. селект возвращает name в тэгах, возвращаемых методом все поля кроме name будут null
     *
     * @param postId
     * @return
     */

    @Query(nativeQuery = true, value = "SELECT name FROM be.tag2post "
            + "JOIN be.tag ON be.tag2post.tag_id = be.tag_id WHERE post_id = :postId")
    List<Tag> findByPostId(Long postId);
}
