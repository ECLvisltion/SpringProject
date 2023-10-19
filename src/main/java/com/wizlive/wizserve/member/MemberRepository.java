package com.wizlive.wizserve.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer>
{
    public boolean existsByEmail(String email);
    public Optional<Member> findByEmail(String email);
}
