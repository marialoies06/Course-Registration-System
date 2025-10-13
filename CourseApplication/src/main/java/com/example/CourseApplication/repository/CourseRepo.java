package com.example.CourseApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseApplication.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
    
}
