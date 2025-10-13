

package com.example.CourseApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseApplication.model.CourseRegistry;
import com.example.CourseApplication.service.CourseRegistryService;

@RestController
public class CourseRegistryController {
    
    @Autowired
    CourseRegistryService courseRegistryService;

    @GetMapping("enrolledStudents")
    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryService.enrolledStudents();
    }
}
