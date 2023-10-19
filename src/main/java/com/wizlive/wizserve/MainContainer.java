package com.wizlive.wizserve;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainContainer
{
    @GetMapping("/wizserve")
    @ResponseBody
    public String index()
    {
        return "wabela";
    }

    @GetMapping("/")
    public String root()
    {
        return "index.html";
    }
}
