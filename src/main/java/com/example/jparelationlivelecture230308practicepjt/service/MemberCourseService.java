package com.example.jparelationlivelecture230308practicepjt.service;

import com.example.jparelationlivelecture230308practicepjt.entity.Course;
import com.example.jparelationlivelecture230308practicepjt.entity.Member;
import com.example.jparelationlivelecture230308practicepjt.entity.MemberCourse;
import com.example.jparelationlivelecture230308practicepjt.repsitory.CourseRepository;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberCourseRepository;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberCourseService {

    private final MemberCourseRepository memberCourseRepository;
    private final CourseRepository courseRepository;

    @Transactional
    public void getMembers() {
        // JPA 강의를 수강하는 멤버 조회하기
        Course findCourse = courseRepository.findByTitle("JPA").orElseThrow(
                () -> new NullPointerException("Not NUll")
        );
        List<MemberCourse> findMember = memberCourseRepository.findAllByCourse(findCourse);

        for (MemberCourse member : findMember) {
            System.out.println();
            System.out.println("JPA 강의 수강하는 Member: " + member.getMember().getName());
        }
    }
}
