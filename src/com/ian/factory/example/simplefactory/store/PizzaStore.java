package com.ian.factory.example.simplefactory.store;

import com.ian.factory.example.simplefactory.SimplePizzaFactory;
import com.ian.factory.example.simplefactory.entity.Pizza;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.getPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

}
