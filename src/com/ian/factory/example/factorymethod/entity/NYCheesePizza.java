package com.ian.factory.example.factorymethod.entity;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NewYork-Cheese";

        toppings.add("cheese-1");
        toppings.add("cheese-2");
        toppings.add("cheese-3");
        toppings.add("cheese-4");
    }
}
