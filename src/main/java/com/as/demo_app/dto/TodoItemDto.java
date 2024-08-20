package com.as.demo_app.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
public class TodoItemDto {
    private Long id;
    @NotEmpty
    private String title;
    private String description;
    private boolean isComplete;
    private Instant createAt;

}
