package com.ian.state.example.state;

import com.ian.state.example.context.GumballMachine;

/**
 * Created by Ian.Lu on 2017/10/10.
 * Project : DesignPatterns
 */
public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没给钱，退啥钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("没给钱，转曲柄也出不来糖");
    }

    @Override
    public void dispense() {
        System.out.println("没给钱，出不了糖");
    }

}
