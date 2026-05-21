package com.example.university.entity;

import jakarta.persistence.*;
import java.util.List;
import jakarta.validation.constraints.*;

@Entity
public class Teacher {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    
    
    private Long id;

    
    
    @NotNull
    
    
    
    private String name;

    
    
    
    
    private String department;





    

    

    

    
    @ManyToMany
    private List<Course> courses;
    



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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    

}