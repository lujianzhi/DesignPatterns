package com.ian.decorator.example.decorator;

import com.ian.decorator.example.Beverage;

/**
 * Created by Ian.Lu on 2017/1/10.
 * Project : DesignPatterns
 */
public class Soy extends BeverageDecorator {

    public Soy(Beverage b) {
        beverage = b;
    }

    @Override
    public int cost() {
        return beverage.cost() + 4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、Soy装饰";
    }
}
