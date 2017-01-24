package com.ian.adapter.example.entity;

/**
 * Created by Ian.Lu on 2017/1/20.
 * Project : DesignPatterns
 */
public class Duck implements IDuck {
    @Override
    public void quack() {
        System.out.println("鸭子叫");
    }

    @Override
    public void fly() {
        System.out.println("鸭子飞");
    }
}
