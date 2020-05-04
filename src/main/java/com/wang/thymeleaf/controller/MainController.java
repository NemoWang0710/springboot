package com.wang.thymeleaf.controller;

import com.wang.thymeleaf.domain.City;
import com.wang.thymeleaf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class MainController {


    @Autowired
    CityService cityService;

    @RequestMapping(value = "/list")
    public String list (Model map){
//        map.put("name","aaa");

        List<City> list = cityService.findAll();

        map.addAttribute("list",list);

        return "list";
    }


//
//    @RequestMapping(value = "/add")
//    public String add(@RequestParam("id") Integer id,@RequestParam("name") String name,ModelMap map){
//
//        String result = cityService.add(id, name);
//        map.put("result",result);
//        return "add";
//    }


    @RequestMapping(value = "/add")
    public String add(@ModelAttribute City city, ModelMap map){

        String result = cityService.add(city);
        map.put("result",result);
        return "add";
    }

    @RequestMapping(value = "/addPage")
    public String addPage(){

        return "add";
    }

}
