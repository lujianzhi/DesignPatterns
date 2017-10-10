package com.ian.state.example.state;

import com.ian.state.example.context.GumballMachine;

/**
 * Created by Ian.Lu on 2017/10/10.
 * Project : DesignPatterns
 */
public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("卖光了，给钱也没用");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没给钱，退不了钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("摇了曲柄，可是没糖");
    }

    @Override
    public void dispense() {
        System.out.println("没糖，出不了糖");
    }

}
