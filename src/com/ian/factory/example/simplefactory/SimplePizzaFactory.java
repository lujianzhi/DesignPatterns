package com.ian.factory.example.simplefactory;

import com.ian.factory.example.simplefactory.entity.CheesePizza;
import com.ian.factory.example.simplefactory.entity.GreekPizza;
import com.ian.factory.example.simplefactory.entity.Pizza;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class SimplePizzaFactory {

    public Pizza getPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else {
            System.out.println("没有所选Pizza");
            return null;
        }
        return pizza;
    }
}
