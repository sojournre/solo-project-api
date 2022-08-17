package com.codestates.helper;

import com.codestates.api.v1.member.dto.MemberDto;
import com.codestates.api.v1.member.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

public class StubData {
    public static class MockMember {
        public static Page<Member> getMultiResultMember() {
            Member member1 = new Member("김코딩", "s4goodbye!", "m", "프로젝트스테이츠", 005, 001);
            Member member2 = new Member("정버그", "s4goodbye!", "f", "프로젝트캠퍼스", 002, 004);

            return new PageImpl<>(List.of(member1, member2),
                    PageRequest.of(0, 10, Sort.by("memberId").descending()), 2);
        }

        public static List<MemberDto.Response> getMultiResponseBody() {
            return List.of(
                    new MemberDto.Response(1L, "김코딩", "s4goodbye!", "m", "프로젝트스테이츠", 005, 001),
                    new MemberDto.Response(2L, "정버그", "s4goodbye!", "f", "프로젝트캠퍼스", 002, 004)
            );
        }
    }
}
