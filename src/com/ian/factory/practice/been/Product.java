package com.ian.factory.practice.been;

/**
 * Created by Ian.Lu on 2017/9/22.
 * Project : DesignPatterns
 */
public abstract class Product {

    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                '}';
    }
}
