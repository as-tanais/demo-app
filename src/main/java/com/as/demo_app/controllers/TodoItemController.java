package com.as.demo_app.controllers;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.services.TodoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/todo")
public class TodoItemController {
    private final TodoItemService todoItemService;

    @GetMapping("/")
    public Collection<TodoItemDto> getAll() {
        return todoItemService.getAll();
    }



}
