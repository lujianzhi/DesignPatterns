package com.ian.factory.example.factorymethod.store;

import com.ian.factory.example.factorymethod.entity.BostonCheesePizza;
import com.ian.factory.example.factorymethod.entity.BostonGreekPizza;
import com.ian.factory.example.factorymethod.entity.Pizza;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public class BostonPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new BostonCheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new BostonGreekPizza();
        } else {
            System.out.println("没有所选Pizza");
        }
        return pizza;
    }
}
