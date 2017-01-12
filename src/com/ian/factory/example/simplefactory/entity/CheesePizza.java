package com.ian.factory.example.simplefactory.entity;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese";

        toppings.add("cheese-1");
        toppings.add("cheese-2");
        toppings.add("cheese-3");
        toppings.add("cheese-4");
    }
}
