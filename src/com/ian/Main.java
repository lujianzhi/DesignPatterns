package com.ian;

import com.ian.strategy.example.behavior.*;
import com.ian.strategy.example.entity.Duck;
import com.ian.strategy.example.entity.ModelDuck;
import com.ian.strategy.example.entity.MuteDuck;
import com.ian.strategy.example.entity.RedHeadDuck;

/**
 * Created by Ian.Lu on 2016/11/15.
 * Project : DesignPatterns
 */
public class Main {

    public static void main(String[] args) {
        //策略模式example
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehavior(new FlyWithWings());
        redHeadDuck.setQuackBehavior(new Quack());
        redHeadDuck.action();

        Duck muteDuck = new MuteDuck();
        muteDuck.setFlyBehavior(new FlyNoWay());
        muteDuck.setQuackBehavior(new MuteQuack());
        muteDuck.action();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.action();


        //策略模式homework one
//        MyCharacter queen = new Queen();
//        queen.setWeaponBehavior(new KnifeBehavior());
//        queen.fight();
//
//        MyCharacter king = new King();
//        king.setWeaponBehavior(new SwordBehavior());
//        king.fight();
    }
}
