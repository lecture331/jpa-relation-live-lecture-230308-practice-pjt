package com.example.jparelationlivelecture230308practicepjt.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    @OneToMany
//    @JoinColumn(name = "team_id")
//    private List<Member> memberList = new ArrayList<>();

    @OneToMany(mappedBy = "team")
    private List<Member> memberList = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public void addMember(Member member) {
        memberList.add(member);
        member.setTeam(this);
    }
}


