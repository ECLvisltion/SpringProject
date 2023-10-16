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

@Entity
public class Question
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;
    
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;


    //#region Setter
    public void setID(Integer i) { id = i; }
    public void setSubject(String s) { subject = s; }
    public void setContent(String s) { content = s; }
    public void setCreateDate(LocalDateTime ldt) { createDate = ldt; }
    public void setAnswerList(List<Answer> la) { answerList = la; }
    //#endregion
    //#region Getter
    public Integer getID() { return id; }
    public String getSubject() { return subject; }
    public String getContent() { return content; }
    public LocalDateTime getCreateDate() { return createDate; }
    public List<Answer> getAnswerList() { return answerList; }
    //#endregion
}