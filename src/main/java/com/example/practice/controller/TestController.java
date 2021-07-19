package com.example.practice.controller;

import com.example.practice.model.Cartoon;
import com.example.practice.model.CartoonsSearch;
import com.example.practice.respository.CartoonsMemoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/api")
@Controller
public class TestController {

    private CartoonsMemoryRepository cartoonsMemoryRepository;
    public TestController(CartoonsMemoryRepository cartoonsMemoryRepository){
        this.cartoonsMemoryRepository = cartoonsMemoryRepository;
    }

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "홈화면 입니다.";
    }


    //http://localhost:8080/api/cartoons?date=20210713&genre=music&finished=false 요청
    @GetMapping("/cartoons")
    @ResponseBody
    public List<Cartoon> cartoons(CartoonsSearch cartoonsSearch){
        System.out.println(cartoonsSearch.toString());
        return cartoonsMemoryRepository.selectAll(cartoonsSearch);
    }



}
