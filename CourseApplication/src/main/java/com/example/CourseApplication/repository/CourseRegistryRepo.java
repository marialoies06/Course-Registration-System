package com.example.CourseApplication.repository;
import com.example.CourseApplication.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer> {
    
}
