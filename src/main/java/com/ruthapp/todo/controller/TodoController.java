package com.ruthapp.todo.controller;

import com.ruthapp.todo.model.Todo;
import com.ruthapp.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/create-todo")
    public ResponseEntity<Todo> saveTodo(@RequestBody Todo todo){
        todoService.saveTodo(todo);
        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }
    //read all operation
    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id){
        Optional<Todo> todo = todoService.findById(id);
        if(todo.isPresent()){
        return ResponseEntity.ok(todo.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }



    //update operation
    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo, @PathVariable("id") Long id){
        todoService.updateTodo(todo, id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(todo);
    }

    //delete operation
    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable("id") Long id){
        todoService.deleteTodo(id);
        return "Deleted successfully";
    }
}
