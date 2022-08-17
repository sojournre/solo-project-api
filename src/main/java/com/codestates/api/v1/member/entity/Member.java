package com.codestates.api.v1.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;

    private String password;

    private String sex;

    private String companyName;

    private Integer companyType;

    private Integer companyLocation;

    public Member(String name, String password, String sex, String companyName, Integer companyType, Integer companyLocation) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyLocation = companyLocation;
    }
}
