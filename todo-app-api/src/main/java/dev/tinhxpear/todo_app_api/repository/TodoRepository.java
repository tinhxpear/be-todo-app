package dev.tinhxpear.todo_app_api.repository;

import dev.tinhxpear.todo_app_api.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, String> {
    List<Todo> findByUsername(String username);
}
