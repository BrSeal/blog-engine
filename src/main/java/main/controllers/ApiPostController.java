package main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class ApiPostController {


    @GetMapping()
    public String getPosts () {
        return "{\n" +
                "\"count\": 390,\n" +
                "\"posts\": [\n" +
                "{\n" +
                "\"id\": 345,\n" +
                "\"timestamp\": 1592338706,\n" +
                "\"user\":\n" +
                "{\n" +
                "\"id\": 88,\n" +
                "\"name\": \"Дмитрий Петров\"\n" +
                "},\n" +
                "\"title\": \"Заголовок поста\",\n" +
                "\"announce\": \"Текст анонса поста без HTML-тэгов\",\n" +
                "\"likeCount\": 36,\n" +
                "\"dislikeCount\": 3,\n" +
                "\"commentCount\": 15,\n" +
                "\"viewCount\": 55\n" +
                "}]\n" +
                "}";
    }

}


