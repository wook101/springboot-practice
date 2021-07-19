package com.example.practice.controller;

import com.example.practice.model.Cartoon;
import com.example.practice.model.CartoonsSearch;
import com.example.practice.respository.CartoonsMemoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,Object> cartoons(CartoonsSearch cartoonsSearch){

        List<Cartoon> cartoons = cartoonsMemoryRepository.selectAll(cartoonsSearch);

        Map<String,Object> map1 = new HashMap<>();
        List<Map<String,Object>> list = new ArrayList<>();
        for(Cartoon cartoon : cartoons){
            Map<String,Object> map2 =  new HashMap<>();
            map2.put("id",cartoon.getId());
            map2.put("title",cartoon.getTitle());
            map2.put("artistName",cartoon.getArtistName());
            map2.put("weekday",cartoon.getWeekday());
            map2.put("genre",cartoon.getGenre());
            map2.put("finished",cartoon.getFinished());
            map2.put("createAt",cartoon.getCreateAt());
            list.add(map2);
        }
        map1.put("data",list);
        map1.put("error",null);

        return map1;
    }



}
