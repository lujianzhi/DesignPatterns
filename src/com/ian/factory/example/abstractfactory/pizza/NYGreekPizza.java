package com.ian.factory.example.abstractfactory.pizza;

import com.ian.factory.example.abstractfactory.ingredient.IngredientFactory;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class NYGreekPizza extends Pizza {

    private IngredientFactory ingredientFactory;

    public NYGreekPizza(IngredientFactory ingredientFactory) {
        name = "NewYork-Greek";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("开始准备" + name + "\n添加作料 : ");
        for (String top : ingredientFactory.getToppings()) {
            System.out.print(top + " ");
        }
        System.out.println("\n厚薄 : " + ingredientFactory.getDough());
        System.out.println("蔬菜 : ");
        for (String veggie : ingredientFactory.getVeggies()) {
            System.out.print(veggie + " ");
        }
        System.out.println();
    }
}
