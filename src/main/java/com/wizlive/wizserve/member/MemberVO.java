package com.wizlive.wizserve.member;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class MemberVO
{
    private Integer id;
    private char[] email;
    private char[] nickname;
    private LocalDateTime createDate;
}
