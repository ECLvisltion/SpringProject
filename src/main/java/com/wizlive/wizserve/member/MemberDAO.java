package com.wizlive.wizserve.member;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wizlive.wizserve.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberDAO
{
    @Autowired
    PasswordEncoder passwordEncoder;
    private final MemberRepo memberRepo;

    public void signUp(String email, String password, String nickname)
    {
        MemberDTO dto = new MemberDTO();
        dto.setEmail(email);
        dto.setPassword(passwordEncoder.encode(password));
        dto.setNickname(nickname);
        dto.setCreateDate(LocalDateTime.now());
        
        this.memberRepo.save(dto);
    }

    public String signIn(String email, String password)
    {
        Optional<MemberDTO> dto = this.memberRepo.findOne<>(password);
        
        if (dto.isPresent()) { return dto.get(); }
        else { throw new DataNotFoundException("question not found"); }
    }
}
