package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
    @GetMapping("/tasks")
    public String helloWorld() {
        return "11.00";
    }
    @GetMapping("/vehicles")
    public String getVehicles(@RequestParam String year,@RequestParam String doors) {
        return String.format("year is %s and doors is %s", year,doors);
    }

}