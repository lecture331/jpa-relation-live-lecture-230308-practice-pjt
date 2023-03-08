package com.example.jparelationlivelecture230308practicepjt.repsitory;


import com.example.jparelationlivelecture230308practicepjt.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name);
}
