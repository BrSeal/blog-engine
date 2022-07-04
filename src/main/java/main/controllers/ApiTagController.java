package main.controllers;

import lombok.AllArgsConstructor;
import main.dao.dto.TagsDTO;
import main.services.ApiTagService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class ApiTagController {

    ApiTagService apiTagService;

    @GetMapping("/tag")
    @ResponseStatus(HttpStatus.OK)
    public TagsDTO getTags(@RequestParam(value = "query", defaultValue = "") String query) {
        return ApiTagService.getAllTags(query);
    }
}
