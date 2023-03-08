package com.example.jparelationlivelecture230308practicepjt;

import com.example.jparelationlivelecture230308practicepjt.entity.Course;
import com.example.jparelationlivelecture230308practicepjt.entity.Member;
import com.example.jparelationlivelecture230308practicepjt.entity.MemberCourse;
import com.example.jparelationlivelecture230308practicepjt.repsitory.CourseRepository;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberCourseRepository;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MemberCourseTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private MemberCourseRepository memberCourseRepository;

    @Test
    @Transactional
    @DisplayName("JPA 강의에 member1, member2를 추가하는 방법")
    void saveDate() {
        Course course = new Course("JPA", "robbie", 10000.0);
        courseRepository.save(course);

        Member member1 = new Member("member1", 99);
        Member member2 = new Member("member2", 33);
        memberRepository.save(member1);
        memberRepository.save(member2);

        List<MemberCourse> memberCourseList = new ArrayList<>();
        memberCourseList.add(new MemberCourse(course, member1));
        memberCourseList.add(new MemberCourse(course, member2));

        memberCourseRepository.saveAllAndFlush(memberCourseList);
    }

}
