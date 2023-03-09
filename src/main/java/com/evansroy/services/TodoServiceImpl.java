package com.evansroy.services;

import com.evansroy.models.Todo;
import com.evansroy.repositories.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository repository;

    public TodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    @Override
    public Todo getTodoById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found"));
    }

    @Override
    public Todo createTodo(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public Todo updateTodoById(Long id, Todo updatedTodo) {
        Todo todo = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found"));
        todo.setTitle(updatedTodo.getTitle());
        todo.setCompleted(updatedTodo.getCompleted());
        return repository.save(todo);
    }

    @Override
    public void deleteTodoById(Long id) {
        repository.deleteById(id);
    }
}

