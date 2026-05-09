package com.app.todo.controller;

import com.app.todo.models.task;
import com.app.todo.service.taskservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping ("/tasks")
public class taskcontroller {
    private final taskservice taskservice;


    public taskcontroller(taskservice taskservice) {
        this.taskservice = taskservice;
    }

        @GetMapping
        public String getTasks(Model model){
            List<task> tasks = taskservice.getAllTasks();
            model.addAttribute("tasks",tasks);
            return "tasks";
        }

       @PostMapping
        public String createTasks( @RequestParam String tittle){
          taskservice.createTasks(tittle);
          return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id){
        taskservice.deleteTasks(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id){
        taskservice.toggleTasks(id);
        return "redirect:/";
    }
    }

