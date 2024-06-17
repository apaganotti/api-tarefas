package br.com.paganotti.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paganotti.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
