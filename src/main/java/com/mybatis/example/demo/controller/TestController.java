package com.mybatis.example.demo.controller;

import com.mybatis.example.demo.model.City;
import com.mybatis.example.demo.service.CityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class TestController {

    @Autowired
    CityService cityService;

    @GetMapping("/save")
    @ResponseBody
    public String save() {

        cityService.saveCity(new City("뉴욕", "미국", 1_000_000L));
        cityService.saveCity(new City("런던", "영국", 2_000_000L));
        cityService.saveCity(new City("파리", """ 
                프랑스AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                프랑스AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                프랑스AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                프랑스AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                프랑스AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
                """, 3_000_000L));

        log.info("Insert : {}", "Save Complete");

        return "Save Complete";
    }
    @GetMapping("/select")
    @ResponseBody
    public ResponseEntity<List<City>> CityService() {

        List<City> city = cityService.selectList();

        return ResponseEntity.ok(city);
    }
}
