package com.tekcamp.todo.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tekcamp.todo.dao.TodoRepository;
import com.tekcamp.todo.model.Todo;
import com.tekcamp.todo.services.TodoServices;

@Service
public class TodoServiceImplementation implements TodoServices {

	private TodoRepository todoRepository;

	public TodoServiceImplementation(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	@Override
	public List<Todo> getAllTodos() {
		ArrayList<Todo> todos = (ArrayList<Todo>) todoRepository.findAll();
		return todos;
	}

	@Override
	public Todo getOneTodo(Long id) {
		Optional<Todo> optionalTodo = todoRepository.findById(id); 
		Todo todo = optionalTodo.get(); 
		return null;
	}

	@Override
	public void createTodo(Todo todo) {
		todoRepository.save(todo); 
	}

	@Override
	public void updateTodo(Todo todo) {
		ArrayList<Todo> todos = (ArrayList<Todo>) todoRepository.findAll(); 
		for (int i = 0; i<todos.size(); i++ ) {
			if (todos.get(i).getId() == todo.getId()) {
				todoRepository.save(todo); 
			}
		}
	}

	
	@Override
	public void deleteTodo(Long id) {
		todoRepository.deleteById(id);
	} 
	
	
	
	
	
}
