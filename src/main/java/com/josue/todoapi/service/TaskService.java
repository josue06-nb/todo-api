package com.josue.todoapi.service;

import com.josue.todoapi.model.Task;
import com.josue.todoapi.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> listarTodas() {
        return taskRepository.findAll();
    }

    public Task criar(Task task) {
        return taskRepository.save(task);
    }

    public Task atualizar(Long id, Task taskAtualizada) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setTitulo(taskAtualizada.getTitulo());
        task.setConcluida(taskAtualizada.getConcluida());
        return taskRepository.save(task);
    }

    public void deletar(Long id) {
        taskRepository.deleteById(id);
    }
}