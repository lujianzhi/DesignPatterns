package com.ian.observer.example2.right.boy;


import com.ian.observer.example2.right.girl.Subject;

/**
 * Created by Ian.Lu on 2019/8/22.
 * Project : DesignPatterns
 */

public class EconomicBoy implements Boy, Observer {

    public EconomicBoy(Subject girl) {
        girl.addObserver(this);
    }

    @Override
    public void careWay() {
        System.out.println("经管系boy:我给你买了你爱吃的，现在在楼下，下来拿吧");
    }

    @Override
    public void update() {
        careWay();
    }
}
