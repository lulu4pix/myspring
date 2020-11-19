package com.readspring.controller;

import com.readspring.bean.Cat;
import com.readspring.bean.Food;
import com.readspring.bean.Mouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @Autowired
    private Cat cat;
    @Autowired
    private Food food1;
    @Autowired
    private Mouse mouse;


    @RequestMapping("/first")
    @ResponseBody
    public String first() {
        System.out.println(cat.toString());
        System.out.println(food1.toString());
        System.out.println(mouse.toString());
        return "1";
    }
}
