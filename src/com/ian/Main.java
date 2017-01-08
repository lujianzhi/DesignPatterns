package com.ian;

import com.ian.observer.example.observer.HumidityObserver;
import com.ian.observer.example.observer.Observer;
import com.ian.observer.example.observer.TemperatureObserver;
import com.ian.observer.example.subject.Subject;
import com.ian.observer.example.subject.WeatherData;

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
        Subject subject = new WeatherData(28, 2, 600);
        Observer humidityObserver = new HumidityObserver();
        Observer temperatureObserver = new TemperatureObserver();
        subject.registerObserver(humidityObserver);
        subject.registerObserver(temperatureObserver);
        subject.setChanged();
        subject.notifyObservers();
    }
}
