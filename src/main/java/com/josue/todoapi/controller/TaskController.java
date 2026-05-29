package com.josue.todoapi.controller;

import com.josue.todoapi.model.Task;
import com.josue.todoapi.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<Task> listarTodas() {
        return taskService.listarTodas();
    }

    @PostMapping
    public ResponseEntity<Task> criar(@RequestBody Task task) {
        return ResponseEntity.status(201).body(taskService.criar(task));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> atualizar(@PathVariable Long id, @RequestBody Task task) {
        return ResponseEntity.ok(taskService.atualizar(id, task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        taskService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}