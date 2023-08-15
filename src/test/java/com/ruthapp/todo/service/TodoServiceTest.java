package com.ruthapp.todo.service;

import com.ruthapp.todo.model.Todo;
import com.ruthapp.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TodoServiceTest {
    @InjectMocks
    TodoService todoService;

    @Mock
    TodoRepository todoRepository;
//
//    @Test
//    void getAllTodos(){
//        Mockito.doReturn(getMockTodos(2)).when(todoRepository).findAll();
//        List<Todo> todos = this.todoService.getAllTodos();
//        assertEquals(2, todos.size());
//    }
//
//    private Iterable<Todo> getMockTodos(int size){
//        List<Todo>
//    }


}
