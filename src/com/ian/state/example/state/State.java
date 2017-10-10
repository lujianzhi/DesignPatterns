package com.ian.state.example.state;

import com.ian.state.example.context.GumballMachine;

/**
 * Created by Ian.Lu on 2017/10/10.
 * Project : DesignPatterns
 */
public abstract class State {

    protected GumballMachine gumballMachine;

    protected State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投入钱
     */
    public abstract void insertQuarter();

    /**
     * 退回钱
     */
    public abstract void ejectQuarter();

    /**
     * 转动曲柄
     */
    public abstract void turnCrank();

    /**
     * 售出
     */
    public abstract void dispense();
}
