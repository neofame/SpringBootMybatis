package com.mybatis.example.demo.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class City {
    private Long id;
    private String name;
    private String country;
    private Long population;

    public City() {
    }

    public City(String name, String country, Long population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }
}