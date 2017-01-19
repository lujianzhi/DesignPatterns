package com.ian.command.example.control;

import com.ian.command.example.command.Command;

/**
 * Created by Ian.Lu on 2017/1/19.
 * Project : DesignPatterns
 */
public class SimpleRemoteControler {

    private Command[] command;
    //记录上一个操作的对象
    private Command preCommand;

    public void setCommand(Command[] command) {
        this.command = command;
    }

    public void pressOnButton() {
        preCommand = command[0];
        command[0].execute();
    }

    public void pressOffButton() {
        preCommand = command[1];
        command[1].execute();
    }

    public void undo() {
        //利用上一个操作的对象，来实现undo方法
        preCommand.undo();
    }
}
