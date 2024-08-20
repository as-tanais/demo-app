package com.as.demo_app.services;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.models.TodoItem;
import com.as.demo_app.repositories.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface TodoItemService {
    TodoItemDto save(TodoItemDto todoItemDto);
    TodoItemDto update(int id, TodoItemDto todoItemDto);
    void deleteById(int id);
    List<TodoItemDto> getAll();
    TodoItemDto getById(int id);
}
