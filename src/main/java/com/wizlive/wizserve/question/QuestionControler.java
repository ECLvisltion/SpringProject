package com.wizlive.wizserve.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionControler
{
    @GetMapping("/question/list")
    public String list()
    {
        return "question_list.html";
    }
}
