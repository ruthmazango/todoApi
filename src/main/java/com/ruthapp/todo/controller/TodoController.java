package com.ruthapp.todo.controller;

import com.ruthapp.todo.model.Todo;
import com.ruthapp.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    @Autowired
    private TodoService todoService;

    //save operation
    @PostMapping("/create-todo")
    public Todo saveTodo(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    //read all operation
    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    //update operation
    @PutMapping("/id")
    public Todo updateTodo(@RequestBody Todo todo, @PathVariable("id") Long id){
        return todoService.updateTodo(todo, id);
    }

    //delete operation
    @DeleteMapping("/id")
    public String deleteTodo(@PathVariable("id") Long id){
        todoService.deleteTodo(id);
        return "Deleted successfully";
    }
}
