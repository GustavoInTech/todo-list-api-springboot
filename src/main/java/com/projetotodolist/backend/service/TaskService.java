package com.projetotodolist.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projetotodolist.backend.model.Task;
import com.projetotodolist.backend.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // LISTAR
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    // LISTAR POR ID
    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

    // CRIAR
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    // ATUALIZAR
    public Task update(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            task.setTitulo(updatedTask.getTitulo());
            task.setDescricao(updatedTask.getDescricao());
            task.setConcluido(updatedTask.isConcluido());
            return taskRepository.save(task);
        })
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com o ID: " + id));
    }

    // MARCAR COMO CONCLUIDA
    public Task markAsCompleted(Long id) {
        return taskRepository.findById(id).map(task -> {
            task.setConcluido(true);
            return taskRepository.save(task);
        })
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com o ID: " + id));
    }

    // DELETAR
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

}
