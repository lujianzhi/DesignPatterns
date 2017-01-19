package com.ian.command.example.furniture;

/**
 * Created by Ian.Lu on 2017/1/19.
 * Project : DesignPatterns
 */
public class LivingRoomLight extends Light {

    @Override
    public void on() {
        System.out.println("客厅灯打开");
    }

    @Override
    public void off() {
        System.out.println("客厅灯关闭");
    }
}
