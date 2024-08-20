package com.as.demo_app.services;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.mappers.TodoItemMapper;
import com.as.demo_app.models.TodoItem;
import com.as.demo_app.repositories.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoItemServiceImpl implements TodoItemService{

    private final TodoItemRepository todoItemRepository;
    private final TodoItemMapper todoItemMapper;

    @Override
    public TodoItemDto save(TodoItemDto todoItemDto) {
        return null;
    }

    @Override
    public TodoItemDto update(int id, TodoItemDto todoItemDto) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        //todoItemRepository.deleteById(getById(id));
    }

    @Override
    public List<TodoItemDto> getAll() {
        return todoItemRepository.findAll().stream().map(todoItemMapper::toTodoItemDto).toList();
    }

    @Override
    public TodoItemDto getById(int id) {
        return null;
    }
}
