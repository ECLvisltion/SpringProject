package com.wizlive.wizserve.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberSignUp
{
    @NotBlank(message = "이메일을 입력해주세요.")
    private String email;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;
    private String passwordCheck;

    @NotBlank(message = "닉네임을 입력해주세요.")
    private String nickname;

    public Member toEntity(String encodedPassword)
    {
        Member m = new Member();

        m.setEmail(email);
        m.setNickname(nickname);
        m.setPassword(encodedPassword);
        
        return m;
    }
}
