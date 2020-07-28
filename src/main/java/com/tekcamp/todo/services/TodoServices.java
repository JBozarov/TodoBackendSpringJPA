package com.tekcamp.todo.services;

import java.util.List;

import com.tekcamp.todo.model.Todo;



public interface TodoServices {

	List<Todo> getAllTodos();

	Todo getOneTodo(Long id);

	void createTodo(Todo todo);

	void updateTodo(Todo todo);

}
