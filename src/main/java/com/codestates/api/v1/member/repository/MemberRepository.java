package com.codestates.api.v1.member.repository;

import com.codestates.api.v1.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
