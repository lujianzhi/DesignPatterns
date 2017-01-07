package com.ian.strategy.example.entity;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public class ModelDuck extends Duck {
    @Override
    void display() {
        System.out.println("我是模型鸭");
    }
}
