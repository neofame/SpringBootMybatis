package com.mybatis.example.demo.repository;

import com.mybatis.example.demo.model.City;

import java.util.List;

public interface CityRepository {

    public void saveCity(City city);

    public List<City> selectList();
}
