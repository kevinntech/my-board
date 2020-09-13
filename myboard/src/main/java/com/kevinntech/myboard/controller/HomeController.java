package com.kevinntech.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index"; // 어떠한 타임리프 파일로 갈지 결정해줌
    }
}
