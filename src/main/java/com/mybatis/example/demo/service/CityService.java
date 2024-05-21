package com.mybatis.example.demo.service;

import com.mybatis.example.demo.model.City;
import com.mybatis.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void saveCity(City city) {

        cityRepository.saveCity(city);
    }

    public List<City> selectList() {

        return cityRepository.selectList();
    }

}
