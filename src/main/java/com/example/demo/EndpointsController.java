package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class EndpointsController {

    @GetMapping("/route")
    public String getIndex() {
        return "GET to index route";
    }
}