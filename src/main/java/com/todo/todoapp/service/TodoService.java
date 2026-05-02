package com.todo.todoapp.service;

import com.todo.todoapp.entity.Todo;
import java.util.List;

public interface TodoService {
    Todo createTodo(Todo todo);
    List<Todo> getAllTodos();
    void deleteTodo(Long id);
    List<Todo> getSortedTodos(String field);
}
