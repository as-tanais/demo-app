package com.as.demo_app.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloController {

    @GetMapping("/hello")
    @Tag(name = "Hello")
    public static String getHello() {
        return "Hello";
    }
}
