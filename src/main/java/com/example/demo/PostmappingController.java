package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class PostmappingController {

    @PostMapping("/postmap")
    public String createTask() {
        return "You just POSTed to tasks";
    }
}
