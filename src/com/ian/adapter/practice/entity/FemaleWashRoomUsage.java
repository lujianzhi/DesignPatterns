package com.ian.adapter.practice.entity;

/**
 * Created by Ian.Lu on 2017/9/26.
 * Project : DesignPatterns
 */
public class FemaleWashRoomUsage implements IWashRoomUsage {

    @Override
    public void washRoom() {
        System.out.println("韩梅梅洗澡");
    }
}
