package com.app.todo.repository;

import com.app.todo.models.task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskrepo extends JpaRepository<task,Long> {
}
