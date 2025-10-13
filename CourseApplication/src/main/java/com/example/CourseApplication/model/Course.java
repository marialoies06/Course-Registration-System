package com.example.CourseApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    private int courseId;
    private String courseName;
    private String courseDescription;
    private String trainerName;
    private int durationInWeeks; // in hours
    
}
