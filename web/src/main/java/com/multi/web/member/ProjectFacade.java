package com.multi.web.member;

import org.springframework.stereotype.Service;

import com.multi.common.member.MemberService;
import com.multi.common.member.domain.dto.MemberDto;

@Service
public class ProjectFacade {

	private final MemberService memberService;

	public ProjectFacade(MemberService memberService) {
		this.memberService = memberService;
	}

	public void saveMember(MemberDto memberDto){
		memberService.saveMember(memberDto);
	}

	public MemberDto findMemberById(Long id){
		return memberService.findMemberById(id);
	}
}
