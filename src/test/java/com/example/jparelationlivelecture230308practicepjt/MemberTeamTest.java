package com.example.jparelationlivelecture230308practicepjt;

import com.example.jparelationlivelecture230308practicepjt.entity.Member;
import com.example.jparelationlivelecture230308practicepjt.entity.Team;
import com.example.jparelationlivelecture230308practicepjt.repsitory.MemberRepository;
import com.example.jparelationlivelecture230308practicepjt.repsitory.TeamRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MemberTeamTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Test
    @Transactional
    @DisplayName("일대다 단방향에서 update 2번 발생")
    public void oneToMany_test1() {
        Team team = new Team("team1");
        teamRepository.save(team);

        Member member1 = new Member("member1", 100);
        Member member2 = new Member("member2", 11);

        team.addMember(member1);
        team.addMember(member2);

        memberRepository.save(member1);
        // 테스트를 위해 flush 를 사용하여 쓰기 지연 저장소에 있는 query 를 바로 DB에 반영시키겠습니다.
        memberRepository.saveAndFlush(member2);
    }

    @Test
    @Transactional
    @DisplayName("다대일 양방향으로 변경해서 update 확인하기")
    public void oneToMany_test2() {
        Team team = new Team("team1");
        teamRepository.save(team);

        Member member1 = new Member("member1", 100);
        Member member2 = new Member("member2", 11);

        team.addMember(member1);
        team.addMember(member2);

        memberRepository.save(member1);
        // 테스트를 위해 flush 를 사용하여 쓰기 지연 저장소에 있는 query 를 바로 DB에 반영시키겠습니다.
        memberRepository.saveAndFlush(member2);

        // update 문이 사라진 것을 볼 수 있으실 겁니다.
        // DB 에서 값이 잘 들어갔는지 확인해 보기 위해서 applicationRunner() 로 이동해서 테스트 해보겠습니다.
    }

}
