package com.example.CourseApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int registryId;//Auto generated

    private String studentName;
    private String studentEmail;
    private String CourseName;

}
