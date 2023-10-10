package com.wizlive.gradle.wizserve;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Answer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    private LocalDateTime createDate;

    private Question question;

    
    //#region Setter
    public void setID(Integer i) { id = i; }
    public void setSubject(String s) { subject = s; }
    public void setCreateDate(LocalDateTime ldt) { createDate = ldt; }
    public void setQuestion(Question q) { question = q; }
    //#endregion
    //#region Getter
    public Integer getID() { return id; }
    public String getSubject() { return subject; }
    public LocalDateTime getCreateDate() { return createDate; }
    public Question getQuestion() { return question; }
    //#endregion
}