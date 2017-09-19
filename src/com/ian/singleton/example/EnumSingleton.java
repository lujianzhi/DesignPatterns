package com.ian.singleton.example;

/**
 * Created by Ian.Lu on 2017/9/18.
 * Project : DesignPatterns
 */
public enum EnumSingleton {
    INSTANCE;

    public void saySomething() {
        System.out.println("枚举完成的单例");
    }
}
