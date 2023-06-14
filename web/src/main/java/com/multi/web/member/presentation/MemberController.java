package com.multi.web.member.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.common.member.domain.dto.MemberDto;
import com.multi.web.member.ProjectFacade;

@RestController
@RequestMapping("/api/members")
public class MemberController {

	private final ProjectFacade projectFacade;

	public MemberController(ProjectFacade projectFacade) {
		this.projectFacade = projectFacade;
	}

	@PostMapping
	public ResponseEntity<Long> saveMember(@RequestBody MemberDto memberDto){
		Long id = projectFacade.saveMember(memberDto);
		return ResponseEntity.ok(id);
	}

	@GetMapping("/{memberId}")
	public ResponseEntity<MemberDto> findMemberById(@PathVariable Long memberId){
		MemberDto memberDto = projectFacade.findMemberById(memberId);
		return ResponseEntity.ok(memberDto);
	}
}
