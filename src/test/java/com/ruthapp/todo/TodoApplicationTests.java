package com.ruthapp.todo;

import com.ruthapp.todo.model.Todo;
import com.ruthapp.todo.service.TodoService;
import com.ruthapp.todo.service.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static javafx.scene.input.DataFormat.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TodoApplicationTests {

//	Todo todo = new Todo();
//	TodoService todoService = null;
//
//	@Test
//	void testCreateTodo() {
//		// Prepare the todo object
//		Todo todo = new Todo(18L, "Test Api", "Test myRest endpoints: create, update, get by id and get all");
//
//		// Set the request headers
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//
//		// Create the request entity with the todo object and headers
//		HttpEntity<Todo> requestEntity = new HttpEntity<>(todo, headers);
//
//		// Send the POST request to create the todo
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8080/api/v1/todo/create-todo", requestEntity, String.class);
//		String locationUrl = responseEntity.getHeaders().getLocation().toString();
//
//		ResponseEntity<Todo> response = restTemplate.getForEntity(locationUrl, Todo.class);
//		Todo createdTodo = response.getBody();
//		System.out.println(createdTodo);
//	}


}
