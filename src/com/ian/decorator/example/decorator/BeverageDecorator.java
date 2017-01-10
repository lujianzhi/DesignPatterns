package com.ian.decorator.example.decorator;

import com.ian.decorator.example.Beverage;

/**
 * Created by Ian.Lu on 2017/1/10.
 * Project : DesignPatterns
 */
public abstract class BeverageDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}
