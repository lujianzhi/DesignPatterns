package com.ian.command.practice.invoker;

import com.ian.command.practice.command.ICommand;

/**
 * Created by Ian.Lu on 2017/9/25.
 * Project : DesignPatterns
 */
public class BuyInvoker {

    private ICommand command;

    public BuyInvoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        command.executed();
    }
}
