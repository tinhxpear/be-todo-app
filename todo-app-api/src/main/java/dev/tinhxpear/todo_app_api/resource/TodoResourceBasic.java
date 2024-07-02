//package dev.tinhxpear.todo_app_api.resource;
//
//import dev.tinhxpear.todo_app_api.model.Todo;
//import dev.tinhxpear.todo_app_api.repository.TodoService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@AllArgsConstructor
//public class TodoResource {
//
//    private TodoService todoService;
//
//    @GetMapping("users/{username}/todos")
//    public List<Todo> getTodos(@PathVariable String username){
//        return todoService.findByUsername(username);
//    }
//
//    @GetMapping("users/{username}/todos/{id}")
//    public Todo getTodoById(@PathVariable String username, @PathVariable int id){
//        return todoService.findById(id);
//    }
//
//    @DeleteMapping("users/{username}/todos/{id}")
//    public ResponseEntity<Void> deleteTodo(@PathVariable int id){
//        todoService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PutMapping("users/{username}/todos/{id}")
//    public Todo updateTodo(@PathVariable int id, @RequestBody Todo todo){
//        todoService.updateTodo(todo);
//        return todo;
//    }
//
//    @PostMapping("users/{username}/todos")
//    public Todo createTodo(@PathVariable String username, @RequestBody Todo todo){
//        return todoService
//                .addTodo(username, todo.getDescription(), todo.getCreateDate(), todo.getTargetDate(), todo.isStatus());
//    }
//}
