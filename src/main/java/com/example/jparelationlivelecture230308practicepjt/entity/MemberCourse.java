package com.example.jparelationlivelecture230308practicepjt.entity;

import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberCourseRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class MemberCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    public MemberCourse(Course course, Member member) {
        this.course = course;
        this.member = member;
    }
}
