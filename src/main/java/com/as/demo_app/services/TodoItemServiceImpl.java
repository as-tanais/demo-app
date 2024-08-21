package com.as.demo_app.services;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.mappers.TodoItemMapper;
import com.as.demo_app.models.TodoItem;
import com.as.demo_app.repositories.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoItemServiceImpl implements TodoItemService{

    private final TodoItemRepository todoItemRepository;
    private final TodoItemMapper todoItemMapper;

    @Override
    public TodoItemDto save(TodoItemDto todoItemDto) {
        if (todoItemDto != null) {
            todoItemDto.setCreateAt(Instant.now());
        }
        TodoItem todoItem = todoItemRepository.save(todoItemMapper.toTodoItem(todoItemDto));
        return todoItemMapper.toTodoItemDto(todoItem);
    }

    @Override
    public TodoItemDto update(Long id, TodoItemDto todoItemDto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        todoItemRepository.deleteById(id);
    }

    @Override
    public List<TodoItemDto> getAll() {
        return todoItemRepository.findAll().stream().map(todoItemMapper::toTodoItemDto).toList();
    }

    @Override
    public Optional<TodoItem> getById(Long id) {
        return todoItemRepository.findById(id);
    }
}
