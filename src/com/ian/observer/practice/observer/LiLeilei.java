package com.ian.observer.practice.observer;

import com.ian.observer.practice.observable.HuaLian;
import com.ian.observer.practice.observable.Observable;
import com.ian.observer.practice.observable.WalMart;

/**
 * Created by Ian.Lu on 2017/9/20.
 * Project : DesignPatterns
 */
public class LiLeilei implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof HuaLian) {
            System.out.println("LiLeilei : " + ((HuaLian) observable).getSb().toString());
        } else if (observable instanceof WalMart) {
            System.out.println("LiLeilei : " + ((WalMart) observable).getSb().toString());
        }
    }
}
