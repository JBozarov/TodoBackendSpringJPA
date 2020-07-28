package com.tekcamp.todo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.*;

import com.tekcamp.todo.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
