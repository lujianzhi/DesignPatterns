package com.ian.proxy.example.staticproxy;

/**
 * Created by Ian.Lu on 2017/10/11.
 * Project : DesignPatterns
 */
public class RealStaticSubject implements IStaticSubject {
    @Override
    public void sayName() {
        System.out.println("我是执行者哦");
    }
}
