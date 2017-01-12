package com.ian.factory.example.factorymethod.store;

import com.ian.factory.example.factorymethod.entity.Pizza;
import com.ian.factory.example.factorymethod.entity.NYCheesePizza;
import com.ian.factory.example.factorymethod.entity.NYGreekPizza;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new NYGreekPizza();
        } else {
            System.out.println("没有所选Pizza");
        }
        return pizza;
    }
}
