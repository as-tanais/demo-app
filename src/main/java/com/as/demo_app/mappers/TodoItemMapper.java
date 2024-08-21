package com.as.demo_app.mappers;

import com.as.demo_app.dto.TodoItemDto;
import com.as.demo_app.models.TodoItem;
import org.springframework.stereotype.Component;

@Component
public class TodoItemMapper {

    public TodoItemDto toTodoItemDto(TodoItem todoItem) {
        return TodoItemDto.builder()
                .id(todoItem.getId())
                .title(todoItem.getTitle())
                .description(todoItem.getDescription())
                .createAt(todoItem.getCreateAt())
                .build()
                ;
    }

    public TodoItem toTodoItem(TodoItemDto todoItemDto) {
        return TodoItem.builder()
                .id(todoItemDto.getId())
                .title(todoItemDto.getTitle())
                .description(todoItemDto.getDescription())
                .createAt(todoItemDto.getCreateAt())
                .build();
    }
}
