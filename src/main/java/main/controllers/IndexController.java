package main.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String index() {
        log.info("Request: /index");
        return "index.html";
    }

    @RequestMapping("/ping")
    @ResponseBody
    public String ping(){
        return "ping";
    }
}
