package com.todo.todoapp.service.impl;

import com.todo.todoapp.entity.Todo;
import com.todo.todoapp.repository.TodoRepository;
import com.todo.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> getSortedTodos(String field) {
        return todoRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }
}