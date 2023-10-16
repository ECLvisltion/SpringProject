package com.wizlive.wizserve.answer;

import java.time.LocalDateTime;

import com.wizlive.wizserve.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Answer
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWER_ID")
    private Integer id;

    @Setter
    @Column(columnDefinition = "TEXT")
    private String content;

    @Setter
    private LocalDateTime createDate;

    @Setter
    @ManyToOne
    private Question question;
}