package com.todo.todoapp.controller;

import com.todo.todoapp.entity.Todo;
import com.todo.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // CREATE
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    // GET ALL
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return "Todo deleted successfully";
    }

    // SORTED TODOS
    @GetMapping("/sorted")
    public List<Todo> getSortedTodos(@RequestParam String field) {
        return todoService.getSortedTodos(field);
    }
}