package com.example.university.controller;

import com.example.university.entity.Course;
import com.example.university.service.CourseService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }


    @GetMapping
    public List<Course> findAll() {
        return service.findAll();
    }







}