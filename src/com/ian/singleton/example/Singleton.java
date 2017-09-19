package com.ian.singleton.example;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Ian.Lu on 2017/1/19.
 * Project : DesignPatterns
 */
public class Singleton implements Serializable {

    static final long serialVersionUID = 1L;

    private String name;

    private Singleton(String name) {
        this.name = name;
    }

    private void getName() {
        System.out.println("单例:" + name);
    }

    //静态内部类
    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton("静态内部类单例");
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }


    //双重锁
//    private static volatile Singleton singleton;
//
//    public static Singleton getInstance() {
//        //双重锁，确保只有第一次创建对象时才执行同步的代码
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton("双重锁");
//                }
//            }
//        }
//        singleton.getName();
//        return singleton;
//    }

    //饿汉:多线程不会有风险
//    private static Singleton singleton = new Singleton("饿汉");
//
//    public static Singleton getInstance() {
//        singleton.getName();
//        return singleton;
//    }

    //懒汉:多线程时会有风险
//    private static Singleton singleton;
//
//    public static Singleton getInstance(String name) {
//        if (singleton == null) {
//            singleton = new Singleton(name);
//        }
//        singleton.getName();
//        return singleton;
//    }

    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.singleton;
    }
}
