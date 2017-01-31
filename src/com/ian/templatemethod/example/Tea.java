package com.ian.templatemethod.example;

/**
 * Created by Ian.Lu on 2017/1/31.
 * Project : DesignPatterns
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入茶伴侣");
    }

    @Override
    protected void brew() {
        System.out.println("冲泡茶叶");
    }

    @Override
    protected boolean needCondiments() {
        return false;
    }
}
