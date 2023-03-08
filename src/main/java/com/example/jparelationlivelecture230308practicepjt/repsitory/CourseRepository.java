package com.example.jparelationlivelecture230308practicepjt.repsitory;


import com.example.jparelationlivelecture230308practicepjt.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByTitle(String title);
}
