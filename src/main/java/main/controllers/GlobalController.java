package main.controllers;

import main.dao.dto.BlogDataResponse;
import main.services.GlobalService;
import main.dao.entities.GlobalSettings;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/")
@ConfigurationProperties(prefix = "application")
public class GlobalController {

    @Resource
    GlobalService globalService;

    @GetMapping("init")
    public BlogDataResponse init(){
        return globalService.getGlobalData();
    }

    @GetMapping("settings")
    public List<GlobalSettings> settings(){
        return globalService.getGlobalSettings();
    }
}
