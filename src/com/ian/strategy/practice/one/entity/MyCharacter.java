package com.ian.strategy.practice.one.entity;

import com.ian.strategy.practice.one.model.WeaponBehavior;

/**
 * Created by Ian.Lu on 2017/1/7.
 * Project : DesignPatterns
 */
public abstract class MyCharacter {

    private WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
