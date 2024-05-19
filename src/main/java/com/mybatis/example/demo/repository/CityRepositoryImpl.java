package com.mybatis.example.demo.repository;

import com.mybatis.example.demo.model.City;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Alias("city")
public class CityRepositoryImpl implements CityRepository {

    @Autowired
    private SqlSession sqlSession;

    public CityRepositoryImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public void saveCity(City city) {
        sqlSession.insert("CityMapper.saveCity", city);

    }

    @Override
    public List<City> selectList() {

        return sqlSession.selectList("SelectMapper.selectAllCity");
    }



}
