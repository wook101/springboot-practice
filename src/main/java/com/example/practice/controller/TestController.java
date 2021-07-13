package com.example.practice.controller;

import com.example.practice.model.CartoonsSearch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/api")
@Controller
public class TestController {


    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "홈화면 입니다.";
    }

    @GetMapping("/cartoons")
    @ResponseBody
    public String cartoons(CartoonsSearch cartoonsSearch){

        return "웹툰 테스트입니다.";
    }



}
