package com.wizlive.wizserve.question;

import java.time.LocalDateTime;
import java.util.List;

import com.wizlive.wizserve.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Question
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Integer id;

    @Setter
    @Column(length = 200)
    private String subject;

    @Setter
    @Column(columnDefinition = "TEXT")
    private String content;
    
    @Setter
    private LocalDateTime createDate;

    @Setter
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}