package com.wizlive.wizserve.member;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Member
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", columnDefinition = "int unsigned")
    private Integer id;
    
    @Column(nullable = false)
    @ColumnDefault("false")
    private Boolean admin;

    @Column(nullable = false)
    private LocalDateTime createDate;

    @Setter
    @Column(columnDefinition = "text", unique = true, nullable = false)
    private String email;

    @Setter
    @Column(length = 32, nullable = false)
    private String nickname;

    @Setter
    @Column(columnDefinition = "text", nullable = false)
    private String password;
}
