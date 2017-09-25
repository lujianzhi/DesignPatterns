package com.ian.command.practice.command;

import com.ian.command.practice.receiver.BuyBuyBuy;

/**
 * Created by Ian.Lu on 2017/9/25.
 * Project : DesignPatterns
 */
public class BuyCommand implements ICommand {

    private BuyBuyBuy buyBuyBuy;

    public BuyCommand(BuyBuyBuy buyBuyBuy) {
        this.buyBuyBuy = buyBuyBuy;
    }

    @Override
    public void executed() {
        buyBuyBuy.buy();
    }
}
