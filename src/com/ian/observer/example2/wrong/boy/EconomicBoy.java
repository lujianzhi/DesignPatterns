package com.ian.observer.example2.wrong.boy;

/**
 * Created by Ian.Lu on 2019/8/21.
 * Project : DesignPatterns
 * <p>
 * 经管系boy
 */

public class EconomicBoy implements Boy {
    @Override
    public void careWay() {
        System.out.println("经管系boy:我给你买了你爱吃的，现在在楼下，下来拿吧");
    }
}
