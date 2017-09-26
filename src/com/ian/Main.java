package com.ian;

import com.ian.adapter.practice.adapter.WashRoomUsageAdapter;
import com.ian.adapter.practice.entity.FemaleWashRoomUsage;
import com.ian.adapter.practice.entity.IWashRoomUsage;
import com.ian.adapter.practice.entity.MalePee;

/**
 * Created by Ian.Lu on 2016/11/15.
 * Project : DesignPatterns
 */
public class Main {

    public static void main(String[] args) {

        example();

        practice();

    }

    private static void example() {
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
//        com.ian.factory.example.abstractfactory.store.PizzaStore nyPizzaStoreAF = new com.ian.factory.example.abstractfactory.store.NYPizzaStore();
//        nyPizzaStoreAF.orderPizza("greek");
//        System.out.println();
//        com.ian.factory.example.abstractfactory.store.PizzaStore bostonPizzaStoreAF = new com.ian.factory.example.abstractfactory.store.BostonPizzaStore();
//        bostonPizzaStoreAF.orderPizza("greek");


        /**
         * 单例模式
         */
        //懒汉
//        Singleton singleton1 = Singleton.getInstance("懒汉");
//        Singleton singleton2 = Singleton.getInstance("懒汉");
//        Singleton singleton3 = Singleton.getInstance("懒汉");
//        Singleton singleton4 = Singleton.getInstance("懒汉");
//        System.out.println("singleton1 : " + singleton1.hashCode() + " ; singleton2 : " + singleton2.hashCode() + " ; singleton3 : " + singleton3.hashCode() + " ; singleton4 : " + singleton4.hashCode());

        //饿汉
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//        Singleton singleton4 = Singleton.getInstance();
//        System.out.println("singleton1 : " + singleton1.hashCode() + " ; singleton2 : " + singleton2.hashCode() + " ; singleton3 : " + singleton3.hashCode() + " ; singleton4 : " + singleton4.hashCode());

        //双重锁
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//        Singleton singleton4 = Singleton.getInstance();
//        System.out.println("singleton1 : " + singleton1.hashCode() + " ; singleton2 : " + singleton2.hashCode() + " ; singleton3 : " + singleton3.hashCode() + " ; singleton4 : " + singleton4.hashCode());

        //静态内部类单例模式
//        for (int i = 0; i < 5; i++) {
//            new Thread("Thread" + i) {
//                @Override
//                public void run() {
//                    super.run();
//                    Singleton singleton = Singleton.getInstance();
//                    System.out.println("singleton-" + getName() + " : " + singleton.hashCode());
//                }
//            }.start();
//        }

        //枚举单例
//        for (int i = 0; i < 5; i++) {
//            new Thread("Thread" + i) {
//                @Override
//                public void run() {
//                    super.run();
//                    EnumSingleton singleton = EnumSingleton.INSTANCE;
//                    System.out.println("singleton-" + getName() + " : " + singleton.hashCode());
//                }
//            }.start();
//        }


        //命令模式
//        Light livingRoomLight = new LivingRoomLight();
//        Command[] commands = new Command[2];
//        Command lightOnCommand = new LightOnCommand(livingRoomLight);
//        Command lightOffCommand = new LightOffCommand(livingRoomLight);
//        commands[0] = lightOnCommand;
//        commands[1] = lightOffCommand;
//
//        SimpleRemoteControler simpleRemoteControler = new SimpleRemoteControler();
//        simpleRemoteControler.setCommand(commands);
//        simpleRemoteControler.pressOnButton();
//        simpleRemoteControler.undo();
//        simpleRemoteControler.pressOffButton();
//        simpleRemoteControler.undo();


        /**
         * 适配器模式
         */
//        IDuck duck = new Duck();
//        duck.quack();
//        duck.fly();
//
//        Bird bird = new Bird();
//        ChangeToDuckAdapter changeToDuckAdapter = new ChangeToDuckAdapter(bird);
//        changeToDuckAdapter.quack();
//        changeToDuckAdapter.fly();


        /**
         * 模板方法模式
         */
//        CaffeineBeverage coffee = new Coffee();
//        coffee.prepareRecipe();
//
//        CaffeineBeverage tea = new Tea();
//        tea.prepareRecipe();


        /**
         * 迭代器模式
         */
//        Waitress waitress = new Waitress(new DinerMenu(),new PancakeHouseMenu());
//        waitress.printMenu();


        /**
         * 组合模式
         */
    }

    private static void practice() {

        /**
         * 策略模式
         */
//        IWashRoomUsage hanMeimei = new HanMeimei();
//        hanMeimei.goOut();
//        IWashRoomUsage liLeilei = new LiLeilei();
//        liLeilei.setCloth(new AdidasCloth());
//        liLeilei.setGlasses(new SunGlasses());
//        liLeilei.goOut();

        /**
         * 观察者模式
         */
//        Observable walMart = new WalMart();
//        Observable huaLian = new HuaLian();
//        HanMeimei hanMeimei = new HanMeimei();
//        LiLeilei liLeilei = new LiLeilei();
//
//        walMart.registerObserver(hanMeimei);
//        huaLian.registerObserver(hanMeimei);
//        huaLian.registerObserver(liLeilei);
//        walMart.addThings("C,D,E");
//
//        walMart.notifyObservers();
//        huaLian.setDataHasChanged();
//        huaLian.notifyObservers();

        /**
         * 装饰者模式
         */
//        ComponentShopCar hanMeimeiShopCar = new HanMeimeiShopCar();
//        hanMeimeiShopCar = new RedShopCar(hanMeimeiShopCar);
//        hanMeimeiShopCar = new FourWheelsShopCar(hanMeimeiShopCar);
//        hanMeimeiShopCar.shopCar();
//
//        ComponentShopCar liLeileiShopCar = new LiLeileiShopCar();
//        liLeileiShopCar = new FourWheelsShopCar(liLeileiShopCar);
//        liLeileiShopCar.shopCar();

        /**
         * 工厂方法模式
         */
//        ProductFactory walMartFactory = new WalMartFactory();
//        Product product = walMartFactory.createProduct(Book.class);
//        System.out.println(product.toString());
//        System.out.println(walMartFactory.createProduct().toString());

        /**
         * 抽象工厂模式
         */
//        AbstractFactory bookFactory = new BookFactory();
//        System.out.println(bookFactory.getProduct().toString());
//        System.out.println(bookFactory.getProductB().toString());
//
//        AbstractFactory deskFactory = new DeskFactory();
//        System.out.println(deskFactory.getProduct().toString());
//        System.out.println(deskFactory.getProductB().toString());

        /**
         * 命令模式
         */
//        BuyBuyBuy buyBuyBuy = new BuyBuyBuy();
//        ICommand buyCommand = new BuyCommand(buyBuyBuy);
//
//        BuyInvoker buyInvoker = new BuyInvoker(buyCommand);
//        buyInvoker.action();


        /**
         * 适配器模式
         */
        IWashRoomUsage female = new FemaleWashRoomUsage();
        female.washRoom();

        MalePee malePee = new MalePee();
        malePee.pee();
        WashRoomUsageAdapter washRoomUsageAdapter = new WashRoomUsageAdapter(malePee);
        washRoomUsageAdapter.washRoom();

    }
}
