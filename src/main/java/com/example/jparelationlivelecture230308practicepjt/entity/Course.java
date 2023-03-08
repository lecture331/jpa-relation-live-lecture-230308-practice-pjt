package com.example.jparelationlivelecture230308practicepjt.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String instructors;
    private Double cost;

    @OneToMany(mappedBy = "course")
    private List<MemberCourse> memberCourseList = new ArrayList<>();

    public Course(String title, String instructors, Double cost) {
        this.title = title;
        this.instructors = instructors;
        this.cost = cost;
    }
}
