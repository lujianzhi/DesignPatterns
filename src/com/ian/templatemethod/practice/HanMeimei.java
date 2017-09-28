package com.ian.templatemethod.practice;

/**
 * Created by Ian.Lu on 2017/9/27.
 * Project : DesignPatterns
 */
public class HanMeimei extends DressUp {
    @Override
    void dressHat() {
        System.out.println("蕾丝边遮阳帽");
    }

    @Override
    void dressCloth() {
        System.out.println("连衣裙");
    }

    @Override
    void dressPants() {
        System.out.println("安全裤");
    }

    @Override
    protected boolean needPants() {
        return false;
    }
}
