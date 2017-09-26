package com.ian.adapter.practice.adapter;

import com.ian.adapter.practice.entity.IWashRoomUsage;
import com.ian.adapter.practice.entity.MalePee;

/**
 * Created by Ian.Lu on 2017/9/26.
 * Project : DesignPatterns
 */
public class WashRoomUsageAdapter implements IWashRoomUsage {

    private MalePee malePee;

    public WashRoomUsageAdapter(MalePee malePee) {
        this.malePee = malePee;
    }

    @Override
    public void washRoom() {
        malePee.pee();
    }
}
