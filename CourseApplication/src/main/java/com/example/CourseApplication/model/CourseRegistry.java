package com.example.CourseApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor // Constructor for all fields (but we'll use a custom one below too if needed)
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registry_id;

    private String studentName;
    private String studentEmail;
    private String courseName;

    // ✅ JPA needs a no-argument constructor
    public CourseRegistry() {
    }
}
