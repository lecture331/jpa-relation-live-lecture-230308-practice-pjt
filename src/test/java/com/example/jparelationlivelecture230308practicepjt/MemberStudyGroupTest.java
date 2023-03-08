package com.example.jparelationlivelecture230308practicepjt;

import com.example.jparelationlivelecture230308practicepjt.entity.Member;
import com.example.jparelationlivelecture230308practicepjt.entity.StudyGroup;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberRepository;
import com.example.jparelationlivelecture230308practicepjt.repsitory.StudyGroupRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MemberStudyGroupTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private StudyGroupRepository studyGroupRepository;

    @Test
    @Transactional
    @DisplayName("robbie JPA Relation 스터디 그룹에 등록")
    void saveDate() {

        StudyGroup studyGroup = new StudyGroup("JPA Relation", "MASTER");
        studyGroupRepository.save(studyGroup);

        Member member1 = new Member("robbie", 99);
        member1.setStudyGroup(studyGroup);
        memberRepository.saveAndFlush(member1);
    }

}
