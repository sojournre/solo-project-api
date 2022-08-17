package com.codestates.api.v1.member.mapper;

import com.codestates.api.v1.member.dto.MemberDto;
import com.codestates.api.v1.member.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {
    List<MemberDto.Response> membersToMemberResponses(List<Member> members);
}
