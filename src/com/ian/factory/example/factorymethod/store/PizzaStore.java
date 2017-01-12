package com.ian.factory.example.factorymethod.store;

import com.ian.factory.example.factorymethod.entity.Pizza;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    /**
     * 抽象工厂方法
     */
    abstract Pizza createPizza(String type);

}
