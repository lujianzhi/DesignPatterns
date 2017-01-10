package com.ian.decorator.example.decorator;

import com.ian.decorator.example.Beverage;

/**
 * Created by Ian.Lu on 2017/1/10.
 * Project : DesignPatterns
 */
public class Mocha extends BeverageDecorator {

    public Mocha(Beverage b) {
        beverage = b;
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " 、 Mocha装饰";
    }
}
