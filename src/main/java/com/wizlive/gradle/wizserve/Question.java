package com.wizlive.gradle.wizserve;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;
    
    private LocalDateTime createDate;


    //#region Setter
    public void setID(Integer i) { id = i; }
    public void setSubject(String s) { subject = s; }
    public void setContent(String s) { content = s; }
    public void setCreateDate(LocalDateTime ldt) { createDate = ldt; }
    //#endregion
    //#region Getter
    public Integer getID() { return id; }
    public String getSubject() { return subject; }
    public String getContent() { return content; }
    public LocalDateTime getCreateDate() { return createDate; }
    //#endregion
}