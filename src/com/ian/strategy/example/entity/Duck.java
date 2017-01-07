package com.ian.strategy.example.entity;

import com.ian.strategy.example.behavior.FlyBehavior;
import com.ian.strategy.example.behavior.QuackBehavior;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    abstract void display();

    public void action() {
        display();
        fly();
        quack();
    }

    private void fly() {
        flyBehavior.fly();
    }

    private void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
