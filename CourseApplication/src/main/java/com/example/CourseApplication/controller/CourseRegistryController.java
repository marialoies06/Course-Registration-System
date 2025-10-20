

package com.example.CourseApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseApplication.model.CourseRegistry;
import com.example.CourseApplication.service.CourseRegistryService;

@RestController
public class CourseRegistryController {
    
    @Autowired
    CourseRegistryService courseRegistryService;

    @CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
    @GetMapping("enrolledStudents")
    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryService.enrolledStudents();
    }

    @CrossOrigin(origins = "http://localhost:5173") // Allow React frontend
    @PostMapping("registerNew")
    public String registerNew( @RequestParam String studentName, 
                               @RequestParam String studentEmail, 
                               @RequestParam String courseName) {
            
        courseRegistryService.registerNew(studentName, studentEmail, courseName);
        return "Registered Successfully" + studentName + " for the course " + courseName;
    }
}
