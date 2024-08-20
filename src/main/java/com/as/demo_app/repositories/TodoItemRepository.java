package com.as.demo_app.repositories;

import com.as.demo_app.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
