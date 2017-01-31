package com.ian.templatemethod.example;

/**
 * Created by Ian.Lu on 2017/1/31.
 * Project : DesignPatterns
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入咖啡伴侣");
    }

    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }
}
