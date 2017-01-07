package com.ian.strategy.example.behavior;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("模型鸭子吱吱叫");
    }
}
