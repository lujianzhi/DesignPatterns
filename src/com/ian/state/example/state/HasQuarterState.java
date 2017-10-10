package com.ian.state.example.state;

import com.ian.state.example.context.GumballMachine;

/**
 * Created by Ian.Lu on 2017/10/10.
 * Project : DesignPatterns
 */
public class HasQuarterState extends State {

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("哥们，给过钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("好吧，退给你钱");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("给了钱，你就可以转动曲柄了");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("虽然你给了钱，但是没有转曲柄，出不了糖");
    }
}
