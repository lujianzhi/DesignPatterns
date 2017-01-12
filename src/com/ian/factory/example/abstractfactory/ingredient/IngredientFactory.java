package com.ian.factory.example.abstractfactory.ingredient;

import java.util.List;

/**
 * Created by Ian.Lu on 2017/1/12.
 * Project : DesignPatterns
 */
public interface IngredientFactory {

    String getDough();

    String[] getVeggies();

    List<String> getToppings();

}
