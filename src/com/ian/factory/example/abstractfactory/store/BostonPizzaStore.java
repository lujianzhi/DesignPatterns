package com.ian.factory.example.abstractfactory.store;

import com.ian.factory.example.abstractfactory.ingredient.BostonIngredientFactory;
import com.ian.factory.example.abstractfactory.ingredient.IngredientFactory;
import com.ian.factory.example.abstractfactory.pizza.*;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public class BostonPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new BostonIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new BostonCheesePizza(ingredientFactory);
        } else if ("greek".equals(type)) {
            pizza = new BostonGreekPizza(ingredientFactory);
        } else {
            System.out.println("没有所选Pizza");
        }
        return pizza;
    }
}
