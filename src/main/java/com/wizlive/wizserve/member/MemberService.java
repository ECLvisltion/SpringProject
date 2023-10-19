package com.wizlive.wizserve.member;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService
{
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // 이메일 중복체크
    public boolean checkEmailDuplicate(String email)
    {
        return memberRepository.existsByEmail(email);
    }

    // 회원가입
    public void signUp(MemberSignUp msu)
    {
        memberRepository.save(msu.toEntity(passwordEncoder.encode(msu.getPassword())));
    }

    // 로그인
    public Member signIn(MemberSignIn msi)
    {
        Optional<Member> optionalMember = memberRepository.findByEmail(msi.getEmail());

        if (optionalMember.isEmpty()) { return null; }

        Member member = optionalMember.get();

        if (!passwordEncoder.matches(msi.getPassword(), member.getPassword())) { return null; }

        return member;
    }

    // 회원고유번호로 회원 찾기
    public Member getSignInMemberByID(Integer memberID)
    {
        if (memberID == null) { return null; }

        Optional<Member> member = memberRepository.findById(memberID);
        if (member.isEmpty()) { return null; }

        return member.get();
    }

    // 이메일로 회원 찾기
    public Member getSignInMemberByEmail(String email)
    {
        if (email == null) { return null; }

        Optional<Member> member = memberRepository.findByEmail(email);
        if (member.isEmpty()) { return null; }

        return member.get();
    }
}
