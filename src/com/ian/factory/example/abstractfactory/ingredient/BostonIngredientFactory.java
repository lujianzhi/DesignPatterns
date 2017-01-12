package com.ian.factory.example.abstractfactory.ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public class BostonIngredientFactory implements IngredientFactory {
    @Override
    public String getDough() {
        return "Boston-厚";
    }

    @Override
    public String[] getVeggies() {
        return new String[]{"生菜", "金针菇", "萝卜"};
    }

    @Override
    public List<String> getToppings() {
        List<String> list = new ArrayList<>();
        list.add("Boston-topping-1");
        list.add("Boston-topping-2");
        list.add("Boston-topping-3");
        list.add("Boston-topping-4");
        return list;
    }
}
