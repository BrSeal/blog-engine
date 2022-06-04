package main.controllers;

import main.dao.dto.TagsDTO;
import main.dao.entities.Tag;
import main.services.ApiTagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/tag")
public class ApiTagController {

    private final ApiTagService apiTagService;

    public ApiTagController(ApiTagService apiTagService) {
        this.apiTagService = apiTagService;
    }

    @GetMapping
    public TagsDTO getTags() {
        return apiTagService.getAllTags();
    }
}
