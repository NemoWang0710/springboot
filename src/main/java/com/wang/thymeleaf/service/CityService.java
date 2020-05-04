package com.wang.thymeleaf.service;

import com.wang.thymeleaf.dao.CityDao;
import com.wang.thymeleaf.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityService {


    @Autowired
    CityDao cityDao;

    public List<City> findAll(){

        return cityDao.findAll();

    }


    public String add(Integer id, String name) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        try {
            cityDao.add(city);
            return "保存成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public String add(City city) {
        try {
            cityDao.add(city);
            return "保存成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
