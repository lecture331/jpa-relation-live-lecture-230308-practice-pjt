package com.example.jparelationlivelecture230308practicepjt.repsitory;

import com.example.jparelationlivelecture230308practicepjt.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
