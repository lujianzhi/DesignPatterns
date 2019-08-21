package com.ian.observer.example2.right.boy;


import com.ian.observer.example2.right.girl.Subject;

/**
 * Created by Ian.Lu on 2019/8/22.
 * Project : DesignPatterns
 */

public class ComputerBoy implements Boy, Observer {

    public ComputerBoy(Subject girl) {
        girl.addObserver(this);
    }

    @Override
    public void careWay() {
        System.out.println("自己去获取女神动态不及时啊，"
                + "还是写个观察者模式让女神主动通知我吧，她一定会感动的");
    }

    @Override
    public void update() {
        careWay();
    }
}
