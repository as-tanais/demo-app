package com.as.demo_app.services;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.exceptions.NotFoundException;
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
public class TodoItemServiceImpl implements TodoItemService {

    private final TodoItemRepository todoItemRepository;
    private final TodoItemMapper todoItemMapper;

    /**
     * Создание задачи
     *
     * @return созданная задача
     */
    @Override
    public TodoItemDto save(TodoItemDto todoItemDto) {
        if (todoItemDto != null) {
            todoItemDto.setCreateAt(Instant.now());
            todoItemDto.setComplete(false);
        }
        TodoItem todoItem = todoItemRepository.save(todoItemMapper.toTodoItem(todoItemDto));
        return todoItemMapper.toTodoItemDto(todoItem);
    }

    @Override
    public TodoItemDto update(Long id, TodoItemDto todoItemDto) {
        validateById(id);
        TodoItem oldTodoItem = todoItemRepository.findById(id).get();

        String newTitle = todoItemDto.getTitle();
        if (newTitle != null) {
            oldTodoItem.setTitle(newTitle);
        }

        String newDescription = todoItemDto.getDescription();
        if (newDescription != null) {
            oldTodoItem.setDescription(newDescription);
        }

        oldTodoItem.setComplete(todoItemDto.isComplete());

        TodoItem todoItem = todoItemRepository.save(oldTodoItem);
        return todoItemMapper.toTodoItemDto(todoItem);
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

    public void validateById(Long id) {
        if (!todoItemRepository.existsById(id)) {
            throw new NotFoundException(String.format("Задача с id %s не найдена", id));
        }
    }
}
