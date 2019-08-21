package com.ian.observer.example2.wrong.boy;

/**
 * Created by Ian.Lu on 2019/8/21.
 * Project : DesignPatterns
 * <p>
 * 计算机系boy
 */

public class ComputerBoy implements Boy {

    @Override
    public void careWay() {
        System.out.println("自己去获取女神动态不及时啊，"
                           + "还是写个观察者模式让女神主动通知我吧，她一定会感动的");
    }
}
