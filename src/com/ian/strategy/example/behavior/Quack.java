package com.ian.strategy.example.behavior;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("正常鸭子叫");
    }
}
