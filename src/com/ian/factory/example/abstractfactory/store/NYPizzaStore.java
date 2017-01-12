package com.ian.factory.example.abstractfactory.store;

import com.ian.factory.example.abstractfactory.ingredient.IngredientFactory;
import com.ian.factory.example.abstractfactory.ingredient.NYIngredientFactory;
import com.ian.factory.example.abstractfactory.pizza.NYCheesePizza;
import com.ian.factory.example.abstractfactory.pizza.NYGreekPizza;
import com.ian.factory.example.abstractfactory.pizza.Pizza;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new NYIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza(ingredientFactory);
        } else if ("greek".equals(type)) {
            pizza = new NYGreekPizza(ingredientFactory);
        } else {
            System.out.println("没有所选Pizza");
        }
        return pizza;
    }
}
