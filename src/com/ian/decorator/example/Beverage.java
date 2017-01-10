package com.ian.decorator.example;

/**
 * Created by Ian.Lu on 2017/1/10.
 * Project : DesignPatterns
 */
public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
