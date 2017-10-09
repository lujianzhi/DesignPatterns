package com.ian.composite.expamle.component;

/**
 * Created by Ian.Lu on 2017/2/8.
 * Project : DesignPatterns
 */
public class MenuItem extends MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("菜目：" + name + "；价格：" + price);
    }
}
