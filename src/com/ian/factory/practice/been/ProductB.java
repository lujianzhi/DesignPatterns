package com.ian.factory.practice.been;

/**
 * Created by Ian.Lu on 2017/9/24.
 * Project : DesignPatterns
 */
public abstract class ProductB {


    private String name;

    public ProductB() {
    }

    public ProductB(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                '}';
    }
}
