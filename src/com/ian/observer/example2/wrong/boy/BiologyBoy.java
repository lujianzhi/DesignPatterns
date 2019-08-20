package com.ian.observer.example2.wrong.boy;

/**
 * Created by Ian.Lu on 2019/8/21.
 * Project : DesignPatterns
 * <p>
 * 生物学系boy
 */

public class BiologyBoy implements Boy {
    @Override
    public void careWay() {
        System.out.println("生物学系boy:吃鸡。。。吧，补充能量，走，下楼，带你去吃KFC");
    }
}
