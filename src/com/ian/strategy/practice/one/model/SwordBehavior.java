package com.ian.strategy.practice.one.model;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用宝剑攻击");
    }
}
