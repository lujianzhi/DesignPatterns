package com.ian.factory.example.abstractfactory.ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public class NYIngredientFactory implements IngredientFactory {
    @Override
    public String getDough() {
        return "NY-厚";
    }

    @Override
    public String[] getVeggies() {
        return new String[]{"香菜", "韭菜", "青菜"};
    }

    @Override
    public List<String> getToppings() {
        List<String> list = new ArrayList<>();
        list.add("NY-topping-1");
        list.add("NY-topping-2");
        list.add("NY-topping-3");
        list.add("NY-topping-4");
        return list;
    }
}