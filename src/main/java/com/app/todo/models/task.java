package com.app.todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class task {
    @Id
    @GeneratedValue
    private Long id;
    private String tittle;
    private boolean completed;



}
