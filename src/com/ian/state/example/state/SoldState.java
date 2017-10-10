package com.ian.state.example.state;

import com.ian.state.example.context.GumballMachine;

/**
 * Created by Ian.Lu on 2017/10/10.
 * Project : DesignPatterns
 */
public class SoldState extends State {

    public SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等，正在出糖");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你已经摇过曲柄了，退不了钱了");
    }

    @Override
    public void turnCrank() {
        System.out.println("别再摇曲柄了");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
