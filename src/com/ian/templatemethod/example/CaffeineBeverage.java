package com.ian.templatemethod.example;

/**
 * Created by Ian.Lu on 2017/1/31.
 * Project : DesignPatterns
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (needCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("烧水");
    }

    private void pourInCup() {
        System.out.println("倒进杯子");
    }

    protected boolean needCondiments() {
        return true;
    }

}
