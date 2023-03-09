package com.evansroy;

import com.evansroy.models.Todo;
import com.evansroy.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    private TodoRepository todoRepository;


    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo();
        todo.setTitle("Go Shipping ");
        todo.setDescription("Shopping at China Square");
        todo.setCompleted(false);
        todoRepository.save(todo);
    }
}
