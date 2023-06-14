package com.multi.common.member.domain.dto;

import com.multi.common.member.domain.Member;

public record MemberDto(
	String name,
	String nickname
) {

	public Member toMember(){
		return new Member(
			this.name,
			this.nickname
		);
	}

	public static MemberDto toDto(Member member){
		return new MemberDto(
			member.getName(),
			member.getNickname()
		);
	}
}
