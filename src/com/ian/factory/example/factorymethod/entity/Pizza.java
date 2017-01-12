package com.ian.factory.example.factorymethod.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/1/11.
 * Project : DesignPatterns
 */
public class Pizza {

    protected String name;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("开始准备" + name + "\n添加作料:");
        for (String top : toppings) {
            System.out.print(top + " ");
        }
        System.out.println();
    }

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
