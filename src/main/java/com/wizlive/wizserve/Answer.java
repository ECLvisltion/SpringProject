package com.wizlive.wizserve;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWER_ID")
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

    
    //#region Setter
    public void setID(Integer i) { id = i; }
    public void setContent(String s) { content = s; }
    public void setCreateDate(LocalDateTime ldt) { createDate = ldt; }
    public void setQuestion(Question q) { question = q; }
    //#endregion
    //#region Getter
    public Integer getID() { return id; }
    public String getContent() { return content; }
    public LocalDateTime getCreateDate() { return createDate; }
    public Question getQuestion() { return question; }
    //#endregion
}