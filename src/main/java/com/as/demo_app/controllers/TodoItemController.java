package com.as.demo_app.controllers;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.services.TodoItemService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@Tag(name = "Список задач")
@RequestMapping(path = "/api/v1/todo")
public class TodoItemController {
    private final TodoItemService todoItemService;

    @GetMapping
    @Operation(summary = "Получить список всех задач. Доступен всем.")
    public Collection<TodoItemDto> getAll() {
        return todoItemService.getAll();
    }

    @PostMapping
    @Operation(summary = "Добавить новую задачу. Доступен только с ролями Admin и User")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public TodoItemDto addTodo(@RequestBody @Valid TodoItemDto todoItemDto) {
        return todoItemService.save(todoItemDto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Удалить задачу. Доступен только с ролью Admin")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public void deleteTodo(@PathVariable Long id) {
        todoItemService.deleteById(id);
    }

}
