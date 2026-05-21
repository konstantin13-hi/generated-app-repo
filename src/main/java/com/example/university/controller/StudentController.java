package com.example.university.controller;

import com.example.university.entity.Student;
import com.example.university.service.StudentService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping
    public List<Student> findAll() {
        return service.findAll();
    }



    @PostMapping
    public Student create(@Valid @RequestBody Student item) {
        return service.save(item);
    }



    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @Valid @RequestBody Student item) {
        return service.update(id, item);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}