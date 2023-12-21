package com.example.dockerdemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/v1/message")
    public String getMessage()
    {
        return "Hello World from Spring Boot";
    }

    @GetMapping("api/v1/update")
    public String updateMessage()
    {
        return "This is an updated message";
    }
}
