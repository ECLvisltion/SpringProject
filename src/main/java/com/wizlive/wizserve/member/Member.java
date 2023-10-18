package com.wizlive.wizserve.member;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Member
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "MEMBER_ID")
    private Integer id;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    @Column(length = 64)
    private String email;

    @Setter
    private String password;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(length = 24)
    private String nickname;
    
    @Setter @Getter
    private LocalDateTime createDate;
}
