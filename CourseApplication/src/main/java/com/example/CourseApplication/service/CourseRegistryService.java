package com.example.CourseApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseApplication.model.CourseRegistry;
import com.example.CourseApplication.repository.CourseRegistryRepo;

@Service
public class CourseRegistryService {
    
    @Autowired
    CourseRegistryRepo courseRegistryRepo;

     public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }
}
