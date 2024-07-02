//package dev.tinhxpear.todo_app_api.repository;
//
//import dev.tinhxpear.todo_app_api.model.Todo;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//@Service
//public class TodoService {
//
//    private static final List<Todo> todos = new ArrayList<>();
//    private static int todosCount = 0;
//    static {
//        todos.add(new Todo(++todosCount, "tinhxpear","Get AWS Certified", LocalDate.now(),
//                LocalDate.now().plusYears(10), false ));
//        todos.add(new Todo(++todosCount, "tinhxpear","Learn DevOps", LocalDate.now(),
//                LocalDate.now().plusYears(11), false ));
//        todos.add(new Todo(++todosCount, "tinhxpear","Learn Full Stack Development", LocalDate.now(),
//                LocalDate.now().plusYears(12), false ));
//    }
//
//    public List<Todo> findByUsername(String username){
//        Predicate<? super Todo> predicate =
//                todo -> todo.getUsername().equalsIgnoreCase(username);
//        return todos.stream().filter(predicate).toList();
//    }
//
//    public Todo addTodo(String username, String description, LocalDate createDate,  LocalDate targetDate, boolean status) {
//        Todo todo = new Todo(++todosCount,username,description,createDate,targetDate,status);
//        todos.add(todo);
//        return todo;
//    }
//
//    public void deleteById(int id) {
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        todos.removeIf(predicate);
//    }
//
//    public Todo findById(int id) {
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        Todo todo = todos.stream().filter(predicate).findFirst().get();
//        return todo;
//    }
//
//    public void updateTodo(Todo todo) {
//        deleteById(todo.getId());
//        todos.add(todo);
//    }
//}
