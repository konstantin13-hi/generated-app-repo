package com.example.university.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.validation.constraints.*;

@Entity
public class Student {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    
    
    private Long id;

    
    
    @NotNull
    
    
    
    @Size(min = 2, max = 50)
    
    private String name;

    
    
    @NotNull
    
    
    @Email
    
    
    private String email;







    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}