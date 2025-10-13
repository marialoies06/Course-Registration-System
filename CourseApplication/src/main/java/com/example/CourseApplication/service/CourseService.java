package com.example.CourseApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseApplication.model.Course;
import com.example.CourseApplication.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;


    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }


   

}
