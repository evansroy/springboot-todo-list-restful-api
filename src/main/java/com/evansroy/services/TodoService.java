package com.evansroy.services;

import com.evansroy.models.Todo;
import com.evansroy.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos(Boolean completed) {
        if (completed == null) {
            return todoRepository.findAll();
        } else {
            return todoRepository.findByCompleted(completed);
        }
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Optional<Todo> updateTodo(Long id, Todo todo) {
        Optional<Todo> existingTodo = todoRepository.findById(id);
        if (existingTodo.isPresent()) {
            Todo updatedTodo = existingTodo.get();
            updatedTodo.setTitle(todo.getTitle());
            updatedTodo.setDescription(todo.getDescription());
            updatedTodo.setCompleted(todo.getCompleted());
            return Optional.of(todoRepository.save(updatedTodo));
        } else {
            return Optional.empty();
        }
    }

    public void deleteTodoById(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

}

