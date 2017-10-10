package com.ian.state.example.context;

import com.ian.state.example.state.*;

/**
 * Created by Ian.Lu on 2017/10/10.
 * Project : DesignPatterns
 */
public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    //需要一个默认的起始状态
    private State state = soldOutState;

    private int gumballCount;

    public GumballMachine(int gumballCount) {
        this.gumballCount = gumballCount;
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        if (this.gumballCount > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("一颗糖出来了");
        if (gumballCount != 0) {
            gumballCount--;
            System.out.println("还剩" + gumballCount + "颗");
        } else {
            System.out.println("没糖了");
        }
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
