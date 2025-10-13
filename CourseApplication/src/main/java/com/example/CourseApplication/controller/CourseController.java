package com.example.CourseApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseApplication.model.Course;
import com.example.CourseApplication.service.CourseService;

@RestController
public class CourseController {
    
    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }
}
