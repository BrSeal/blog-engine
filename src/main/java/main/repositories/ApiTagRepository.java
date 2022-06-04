package main.repositories;


import main.dao.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApiTagRepository extends JpaRepository<Tag, Long> {
    List<Tag> findByNameStartingWith(String query);

    List<Tag> findAll();
}
