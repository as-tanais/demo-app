package com.as.demo_app.services;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.models.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemService {
    TodoItemDto save(TodoItemDto todoItemDto);
    TodoItemDto update(Long id, TodoItemDto todoItemDto);
    void deleteById(Long id);
    List<TodoItemDto> getAll();
    Optional<TodoItem> getById(Long id);
}
