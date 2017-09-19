package com.ian.strategy.practice.one.model;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧头攻击");
    }
}
