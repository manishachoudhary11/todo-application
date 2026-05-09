package com.app.todo.service;

import com.app.todo.models.task;
import com.app.todo.repository.taskrepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class taskservice {

    private final taskrepo taskrepo;

    public taskservice(taskrepo taskrepo) {
        this.taskrepo = taskrepo;
    }

    public List<task> getAllTasks() {
        return taskrepo.findAll();

    }

    public void createTasks(String tittle) {
        task task = new task();
        task.setTittle(tittle);
        task.setCompleted(false);
        taskrepo.save(task);


    }

    public void deleteTasks(Long id) {
        taskrepo.deleteById(id);
    }

    public void toggleTasks(Long id) {
        task task = taskrepo.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("invalid id"));
        task.setCompleted(!task.isCompleted());
        taskrepo.save(task);
    }
}
