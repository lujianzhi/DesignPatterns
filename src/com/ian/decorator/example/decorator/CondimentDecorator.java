package com.ian.decorator.example.decorator;

import com.ian.decorator.example.Beverage;

/**
 * Created by Ian.Lu on 2017/1/10.
 * Project : DesignPatterns
 */
public class CondimentDecorator extends BeverageDecorator {

    public CondimentDecorator(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、CondimentDecorator装饰";
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
