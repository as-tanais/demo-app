package com.as.demo_app.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Handler;

//простой контроллер доступны всем
@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping
    @Tag(name = "Hello")
    @Operation(summary = "Доступен всем")
    public static String getHello() {
        return "Hello";
    }
}
