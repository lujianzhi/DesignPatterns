package com.ian.factory.example.abstractfactory.pizza;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("开始烘烤");
    }

    public void cut() {
        System.out.println("开始切片");
    }

    public void box() {
        System.out.println("开始装箱");
    }
}
