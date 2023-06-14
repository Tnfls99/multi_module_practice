package com.multi.common.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.common.member.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
