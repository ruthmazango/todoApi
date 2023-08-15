package com.ruthapp.todo.service;

import com.ruthapp.todo.model.Todo;
import com.ruthapp.todo.model.TodoPatch;
import com.ruthapp.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    //save operation
    @Override
    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    //read all todos
    @Override
    public List<Todo> getAllTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    //read by id operation
    @Override
    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    //update operation
    @Override
    public Todo updateTodo(Todo todo, Long id) {
        Todo todo1=todoRepository.findById(id).get();
        if(id == null){
            System.out.print("Todo does not exist");
        } else {
            todo1.setTitle(todo.getTitle());
            todo1.setDescription(todo.getDescription());
        } return todoRepository.save(todo1);
    }

//    @Override
//    public Todo updateTodoPatch(TodoPatch todoPatch, Long id) {
//        Todo todo = todoRepository.findById(id).orElse(null);
//        if (todo == null) {
//            System.out.print("Todo does not exist"); // Handle the case when the todo is not found
//        } else {
//            applyPatchToTodo(todoPatch, todo);
//        }return todoRepository.save(todo);
//    }
//
//    private void applyPatchToTodo(TodoPatch todoPatch, Todo todo) {
//
//        if (TodoPatch.getDescription() != null) {
//            todo.setDescription(todoPatch.getDescription());
//        }
//    }


    //delete operation
    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
