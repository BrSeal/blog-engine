package main.services;

import lombok.AllArgsConstructor;
import main.dao.dto.TagsDTO;
import main.dao.entities.Tag;
import main.repositories.ApiTagRepository;
import main.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ApiTagService {

    private final ApiTagRepository apiTagRepository;
    private final PostRepository postRepository;


    public TagsDTO getAllTags(String query) {
        List<Tag> tags;

        if(query == null || query.isBlank()) {
            tags = apiTagRepository.findAll();
        }
        else {
            tags = apiTagRepository.findByNameStartingWith(query);
        }

        //TODO реализовать получение всех weight одним запросом!
        List<TagsDTO.TagDtoObject> tagDtoObjects = tags.stream()
                .map(tag -> new TagsDTO.TagDtoObject(tag.getName(), calculateWeight(tag.getId())))
                .collect(Collectors.toList());
        return new TagsDTO(tagDtoObjects);
    }

    //TODO дописать получение весов
    private static Double calculateWeight(Long tagId) {
        return null;
    }
}
