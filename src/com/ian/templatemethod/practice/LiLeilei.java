package com.ian.templatemethod.practice;

/**
 * Created by Ian.Lu on 2017/9/27.
 * Project : DesignPatterns
 */
public class LiLeilei extends DressUp {
    @Override
    void dressHat() {
        System.out.println("鸭舌帽");
    }

    @Override
    void dressCloth() {
        System.out.println("男士短袖");
    }

    @Override
    void dressPants() {
        System.out.println("牛仔裤");
    }

}
