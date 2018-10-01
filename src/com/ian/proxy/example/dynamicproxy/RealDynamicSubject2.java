package com.ian.proxy.example.dynamicproxy;

/**
 * Created by Ian.Lu on 2018/9/28.
 * Project : DesignPatterns
 */

public class RealDynamicSubject2 implements IDynamicSubject {
    @Override
    public void sayName() {
        System.out.println("我是执行者2号");
    }
}
