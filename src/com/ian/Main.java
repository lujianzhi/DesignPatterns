package com.ian;

import com.ian.decorator.example.Beverage;
import com.ian.decorator.example.concretecomponent.DarkRoast;
import com.ian.decorator.example.concretecomponent.Espresso;
import com.ian.decorator.example.decorator.CondimentDecorator;
import com.ian.decorator.example.decorator.Mocha;
import com.ian.decorator.example.decorator.Soy;

/**
 * Created by Ian.Lu on 2016/11/15.
 * Project : DesignPatterns
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 策略模式example
         */
//        Duck redHeadDuck = new RedHeadDuck();
//        redHeadDuck.setFlyBehavior(new FlyWithWings());
//        redHeadDuck.setQuackBehavior(new Quack());
//        redHeadDuck.action();
//
//        Duck muteDuck = new MuteDuck();
//        muteDuck.setFlyBehavior(new FlyNoWay());
//        muteDuck.setQuackBehavior(new MuteQuack());
//        muteDuck.action();
//
//        Duck modelDuck = new ModelDuck();
//        modelDuck.setFlyBehavior(new FlyNoWay());
//        modelDuck.setQuackBehavior(new Squeak());
//        modelDuck.action();

        /**
         * 策略模式homework one
         */
//        MyCharacter queen = new Queen();
//        queen.setWeaponBehavior(new KnifeBehavior());
//        queen.fight();
//
//        MyCharacter king = new King();
//        king.setWeaponBehavior(new SwordBehavior());
//        king.fight();


        /**
         *观察者模式
         */
//        Subject subject = new WeatherData(28, 2, 600);
//        Observer humidityObserver = new HumidityObserver();
//        Observer temperatureObserver = new TemperatureObserver();
//        subject.registerObserver(humidityObserver);
//        subject.registerObserver(temperatureObserver);
//        subject.setChanged();
//        subject.notifyObservers();

        /**
         * 装饰者模式
         */
        Beverage darkRoast = new DarkRoast();
        darkRoast = new CondimentDecorator(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println("点餐 : " + darkRoast.getDescription() + "\n消费 : " + darkRoast.cost());

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        System.out.println("点餐 : " + espresso.getDescription() + "\n消费 : " + espresso.cost());
    }
}
