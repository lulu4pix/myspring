package com.readspring.extend;

public class Parent  {
    //看这里的this指的是什么
    public Parent() {
        this.say();
    }

    protected void say() {
        System.out.println("father");
    }
}
