package com.as.demo_app.services;

import com.as.demo_app.dto.TodoItemDto;

import java.util.List;

public interface TodoItemService {
    TodoItemDto save(TodoItemDto todoItemDto);
    TodoItemDto update(int id, TodoItemDto todoItemDto);
    void deleteById(int id);
    List<TodoItemDto> getAll();
    TodoItemDto getById(int id);
}
