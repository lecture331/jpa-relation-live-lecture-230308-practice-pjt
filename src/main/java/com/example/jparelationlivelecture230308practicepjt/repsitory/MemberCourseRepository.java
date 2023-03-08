package com.example.jparelationlivelecture230308practicepjt.repsitory;

import com.example.jparelationlivelecture230308practicepjt.entity.Course;
import com.example.jparelationlivelecture230308practicepjt.entity.MemberCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberCourseRepository extends JpaRepository<MemberCourse, Long> {
    List<MemberCourse> findAllByCourse(Course course);
}
