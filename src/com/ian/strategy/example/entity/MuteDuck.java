package com.ian.strategy.example.entity;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public class MuteDuck extends Duck {
    @Override
    void display() {
        System.out.println("我是不会叫也不会飞的鸭子");
    }
}
