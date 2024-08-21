package com.as.demo_app.dto;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@Schema(description = "Запрос на добавление новой задачи")
public class TodoItemDto {
    @Hidden
    private Long id;
    @NotEmpty
    @Schema(description = "Имя задачи", example = "Сдеать домашку")
    private String title;
    @Schema(description = "Описание задачи", example = "Сделать тестовый проект")
    private String description;
    @Schema(description = "Выполнена или нет", example = "false")
    private boolean isComplete;
    @Hidden
    private Instant createAt;

}
