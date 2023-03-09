package com.evansroy.services;

import com.evansroy.models.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodoById(Long id, Todo updatedTodo);
    void deleteTodoById(Long id);
}
