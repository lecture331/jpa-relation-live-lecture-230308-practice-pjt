package com.example.jparelationlivelecture230308practicepjt;

import com.example.jparelationlivelecture230308practicepjt.entity.*;
import com.example.jparelationlivelecture230308practicepjt.repsitory.*;
import com.example.jparelationlivelecture230308practicepjt.service.MemberCourseService;
import com.example.jparelationlivelecture230308practicepjt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class JpaRelationLiveLecture230308PracticePjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaRelationLiveLecture230308PracticePjtApplication.class, args);
    }

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private StudyGroupRepository studyGroupRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private MemberCourseRepository memberCourseRepository;

    @Autowired
    private MemberCourseService memberCourseService;

    @Autowired
    private MemberService memberService;

    @Bean
    @Transactional
    ApplicationRunner applicationRunner() {
        return args -> {
            // 테스트 코드 실행 시키기 전에 요기 부분은 전부 주석 처리 하시는게 좋습니다!

            //"다대일 양방향으로 변경해서 update 확인하기"
//            Team team = new Team("team1");
//            teamRepository.save(team);
//
//            Member member1 = new Member("member1", 100);
//            Member member2 = new Member("member2", 11);
//
//            team.addMember(member1);
//            team.addMember(member2);
//
//            memberRepository.save(member1);
//            memberRepository.save(member2);


        };
    }

}