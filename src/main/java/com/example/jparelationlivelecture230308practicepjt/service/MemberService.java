package com.example.jparelationlivelecture230308practicepjt.service;

import com.example.jparelationlivelecture230308practicepjt.entity.Member;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public void getStudyGroupsName() {
        // robbie 의 스터디 그룹 이름 조회
        Member member = memberRepository.findByName("robbie").orElseThrow(
                () -> new NullPointerException("Not NUll")
        );

        System.out.println("robbie의 스터디 그룹 이름 : " + member.getStudyGroup().getName());
    }
}
