package main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tag")
public class ApiTagController {

    @GetMapping
    public String getTags() {
        return "{\n" +
                "                \"tags\":\n" +
                "[\n" +
                "        {\"name\":\"Java\", \"weight\":1},\n" +
                "        {\"name\":\"Spring\", \"weight\":0.56},\n" +
                "        {\"name\":\"Hibernate\", \"weight\":0.22},\n" +
                "        {\"name\":\"Hadoop\", \"weight\":0.17},\n" +
                "]\n" +
                "}";

    }
}
