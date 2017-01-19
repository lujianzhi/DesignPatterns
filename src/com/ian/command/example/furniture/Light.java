package com.ian.command.example.furniture;

/**
 * Created by Ian.Lu on 2017/1/19.
 * Project : DesignPatterns
 */
public abstract class Light {

    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MIDDLE = 2;
    public static final int HIGH = 3;

    private int state;

    public Light() {
        state = OFF;
    }

    public abstract void on();

    public abstract void off();

    public int getState() {
        return state;
    }

    public void low() {
        state = 1;
        System.out.println("低等亮度");
    }

    public void middle() {
        state = 2;
        System.out.println("中等亮度");
    }

    public void high() {
        state = 3;
        System.out.println("高等亮度");
    }
}
