package com.codestates.api.v1.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class MemberDto {
    @AllArgsConstructor
    @Getter
    public static class Response {
        private long memberId;
        private String name;
        private String password;
        private String sex;
        private String companyName;
        private int companyType;
        private int companyLocation;
    }
}
