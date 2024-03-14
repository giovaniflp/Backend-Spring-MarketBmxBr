package com.api.marketBmxBr.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }
}
