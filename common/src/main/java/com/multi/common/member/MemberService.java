package com.multi.common.member;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.multi.common.member.domain.Member;
import com.multi.common.member.domain.dto.MemberDto;
import com.multi.common.member.repository.MemberRepository;

@Transactional(readOnly = true)
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Transactional
	public Long saveMember(MemberDto memberDto){
		Member member = memberRepository.save(memberDto.toMember());
		return member.getId();
	}

	public MemberDto findMemberById(Long id){
		Member member = memberRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("해당하는 id로 멤버를 찾을 수 없습니다."));

		return MemberDto.toDto(member);
	}

}
