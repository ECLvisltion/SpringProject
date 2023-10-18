package com.wizlive.wizserve.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<MemberDTO, Integer>
{
    Optional<Member> findByEmailAndPassword(String email, String password);
}
