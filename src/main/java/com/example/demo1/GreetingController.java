package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class GreetingController {

    @GetMapping
    public String health() {
        return "{\"status\": \"OK\"}";
    }

}
