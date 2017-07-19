package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class springmathpiwithget {
    @GetMapping("/math/pi")
    public String getMathpi() {
        return "3.141592653589793";
    }
}
