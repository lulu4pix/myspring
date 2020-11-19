package com.readspring.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Cat {
    private String catName;
    private Food food;

    // 构造方法1
    public Cat(String catName, Food food) {
        this.catName = catName;
        this.food = food;
    }

    // 构造方法2
    public Cat(Food food, String catName) {
        this.catName = catName;
        this.food = food;
    }
}
