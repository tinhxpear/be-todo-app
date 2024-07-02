package dev.tinhxpear.todo_app_api.resource;

import dev.tinhxpear.todo_app_api.model.Todo;
import dev.tinhxpear.todo_app_api.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TodoResource {
    private TodoRepository todoRepository;

    @GetMapping("users/{username}/todos")
    public List<Todo> getTodos(@PathVariable String username){
        return todoRepository.findByUsername(username);
    }

    @GetMapping("users/{username}/todos/{id}")
    public Todo getTodoById(@PathVariable String username, @PathVariable String id){
        return todoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id){
        todoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("users/{username}/todos/{id}")
    public Todo updateTodo(@PathVariable String id, @RequestBody Todo todo){
        todoRepository.deleteById(id);
        todoRepository.save(todo);
        return todo;
    }

    @PostMapping("users/{username}/todos")
    public Todo createTodo(@PathVariable String username, @RequestBody Todo todo){
        return todoRepository.save(todo);
    }

}
