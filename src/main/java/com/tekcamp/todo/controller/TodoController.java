package com.tekcamp.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(path="/{id}")
	public Todo getSingleTodo(@PathVariable Long id) {
		Todo foundTodo = todoServices.getOneTodo(id); 
		return foundTodo; 
	}
	
	@PostMapping
	public void createTodo(@RequestBody Todo todo) {
		todoServices.createTodo(todo); 
	}
	
	@PutMapping
	public void updateTodo(@RequestBody Todo todo) {
		todoServices.updateTodo(todo); 
	}
	
}
