package com.ian.command.example.command;

import com.ian.command.example.furniture.Light;

/**
 * Created by Ian.Lu on 2017/1/19.
 * Project : DesignPatterns
 */
public class LightOnCommand implements Command {

    private Light light;
    private int preState;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //在每一次操作前，记录上一次的状态
        this.preState = light.getState();
        //这里操作以后，会改变状态
        light.middle();
    }

    @Override
    public void undo() {
        switch (preState) {
            case Light.OFF:
                light.off();
                break;

            case Light.LOW:
                light.low();
                break;

            case Light.MIDDLE:
                light.middle();
                break;

            case Light.HIGH:
                light.high();
                break;
        }
    }
}
