package com.ian.proxy.example.dynamicproxy;

/**
 * Created by Ian.Lu on 2017/10/11.
 * Project : DesignPatterns
 */
public class RealDynamicSubject implements IDynamicSubject {

    @Override
    public void sayName() {
        System.out.println("我是执行者");
    }
}
