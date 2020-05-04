package com.wang.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class MainController {

    @RequestMapping(value = "/list")
    public String list (ModelMap map){
        map.put("name","aaa");
        return "list";
    }
}
