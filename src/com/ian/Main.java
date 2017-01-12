package com.ian;

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
//        Beverage darkRoast = new DarkRoast();
//        darkRoast = new CondimentDecorator(darkRoast);
//        darkRoast = new Soy(darkRoast);
//        System.out.println("点餐 : " + darkRoast.getDescription() + "\n消费 : " + darkRoast.cost());
//
//        Beverage espresso = new Espresso();
//        espresso = new Mocha(espresso);
//        System.out.println("点餐 : " + espresso.getDescription() + "\n消费 : " + espresso.cost());


        /**
         * 简单工厂方法
         */
//        com.ian.factory.example.simplefactory.store.PizzaStore pizzaStoreSF = new com.ian.factory.example.simplefactory.store.PizzaStore(new SimplePizzaFactory());
//        pizzaStoreSF.orderPizza("greek");


        /**
         * 工厂方法模式
         */
//        com.ian.factory.example.factorymethod.store.PizzaStore nyPizzaStoreFM = new com.ian.factory.example.factorymethod.store.NYPizzaStore();
//        nyPizzaStoreFM.orderPizza("greek");
//        System.out.println();
//        com.ian.factory.example.factorymethod.store.PizzaStore bostonPizzaStoreFM = new com.ian.factory.example.factorymethod.store.BostonPizzaStore();
//        bostonPizzaStoreFM.orderPizza("greek");


        /**
         * 抽象工厂
         */
        com.ian.factory.example.abstractfactory.store.PizzaStore nyPizzaStoreAF = new com.ian.factory.example.abstractfactory.store.NYPizzaStore();
        nyPizzaStoreAF.orderPizza("greek");
        System.out.println();
        com.ian.factory.example.abstractfactory.store.PizzaStore bostonPizzaStoreAF = new com.ian.factory.example.abstractfactory.store.BostonPizzaStore();
        bostonPizzaStoreAF.orderPizza("greek");

    }
}
