package com.ruthapp.todo.service;

import com.ruthapp.todo.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    //create operation
    Todo saveTodo(Todo todo);
    //read all operation
    List<Todo> getAllTodos();
    //read one operation
    Optional<Todo> findById(Long id);
    //update operation
    Todo updateTodo(Todo todo, Long id);
    //delete operation
    void deleteTodo(Long id);
}
