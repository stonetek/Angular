package com.stonetek.crudspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.stonetek.crudspring.model.Course;
import com.stonetek.crudspring.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CourseController {
    
    
    private final CourseRepository courseRepository;

    @GetMapping
    public List<Course> list () {
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code =  HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }

   @DeleteMapping("/courses/{id}")
public void deleteCourse(@PathVariable Long id) {
    courseRepository.deleteById(id);
}
}
