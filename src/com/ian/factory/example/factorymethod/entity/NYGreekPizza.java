package com.ian.factory.example.factorymethod.entity;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class NYGreekPizza extends Pizza {

    public NYGreekPizza() {
        name = "NewYork-Greek";

        toppings.add("greek-1");
        toppings.add("greek-2");
        toppings.add("greek-3");
        toppings.add("greek-4");
    }
}
