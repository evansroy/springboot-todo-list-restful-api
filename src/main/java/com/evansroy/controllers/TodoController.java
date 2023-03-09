package com.evansroy.controllers;

import com.evansroy.models.Todo;
import com.evansroy.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/todos")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return service.getAllTodos();
    }

    @GetMapping("{id}")
    public Todo getTodoById(@PathVariable Long id) {
        return service.getTodoById(id);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return service.createTodo(todo);
    }

    @PutMapping("{id}")
    public Todo updateTodoById(@PathVariable Long id, @RequestBody Todo updatedTodo) {
        return service.updateTodoById(id, updatedTodo);
    }

    @DeleteMapping("{id}")
    public void deleteTodoById(@PathVariable Long id) {
        service.deleteTodoById(id);
    }
}
