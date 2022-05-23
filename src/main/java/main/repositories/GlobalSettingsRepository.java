package main.repositories;

import main.dao.entities.GlobalSettings;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GlobalSettingsRepository extends CrudRepository<GlobalSettings, Integer> {
    List<GlobalSettings> findAll();
}
