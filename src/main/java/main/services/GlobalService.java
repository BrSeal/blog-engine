package main.services;

import main.repositories.GlobalSettingsRepository;
import main.dao.dto.BlogDataResponse;
import main.dao.entities.GlobalSettings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GlobalService {

    @Resource
    GlobalSettingsRepository globalSettingsRepository;

    @Value("#{blogData}")
    public BlogDataResponse globalData;

    public BlogDataResponse getGlobalData() {
        return globalData;
    }

    public List<GlobalSettings> getGlobalSettings(){
        return globalSettingsRepository.findAll();
    }
}
