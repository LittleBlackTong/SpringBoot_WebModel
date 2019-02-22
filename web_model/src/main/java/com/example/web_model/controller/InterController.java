package com.example.web_model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/inter")
public class InterController {
    @RequestMapping("/inter1")
    @ResponseBody
    public String getInter1(){
        return "success";
    }
}
