package com.ian.observer.example2.right.boy;


import com.ian.observer.example2.right.girl.Subject;

/**
 * Created by Ian.Lu on 2019/8/22.
 * Project : DesignPatterns
 */

public class BiologyBoy implements Boy, Observer {

    public BiologyBoy(Subject girl) {
        girl.addObserver(this);
    }

    @Override
    public void careWay() {
        System.out.println("生物学系boy:吃鸡。。。吧，补充能量，走，下楼，带你去吃KFC");
    }

    @Override
    public void update() {
        careWay();
    }
}
