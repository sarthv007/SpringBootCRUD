package io.initializ.labs.todo.services;

import java.util.List;

import io.initializ.labs.todo.model.Todo;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}