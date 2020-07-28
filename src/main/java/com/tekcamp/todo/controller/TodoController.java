package com.tekcamp.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekcamp.todo.model.Todo;
import com.tekcamp.todo.services.TodoServices;



@RestController
@RequestMapping("todos")
public class TodoController {
	
	private final TodoServices todoServices; 
	
	public TodoController(TodoServices todoServices) {
			super(); 
			this.todoServices = todoServices;
	}
	
	@GetMapping
	public List<Todo> getAllTodos() {
		List<Todo> todos = todoServices.getAllTodos();  
		return todos; 
	}
	
	@GetMapping
	public Todo getSingleTodo(Long id) {
		Todo foundTodo = todoServices.getOneTodo(id); 
		return foundTodo; 
	}
	
}
