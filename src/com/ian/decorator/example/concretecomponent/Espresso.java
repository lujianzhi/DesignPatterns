package com.ian.decorator.example.concretecomponent;

import com.ian.decorator.example.Beverage;

/**
 * Created by Ian.Lu on 2017/1/10.
 * Project : DesignPatterns
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso饮料";
    }

    @Override
    public int cost() {
        return 30;
    }
}
