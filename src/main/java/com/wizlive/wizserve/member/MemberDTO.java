package com.wizlive.wizserve.member;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class MemberDTO
{
    @Getter
    private Integer id;
    @Setter @Getter
    private String email;
    @Setter
    private String password;
    @Setter @Getter
    private String nickname;
    @Setter @Getter
    private LocalDateTime createDate;
}
