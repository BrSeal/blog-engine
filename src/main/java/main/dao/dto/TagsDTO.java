package main.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class TagsDTO {
    List<TagDtoObject> tags;

    public TagsDTO(List<TagDtoObject> tags) {
        this.tags = tags;
    }

    @Data
    @AllArgsConstructor
    public static class TagDtoObject{
        String name;
        Double weight;
    }
}
