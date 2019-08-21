package com.ian.observer.example2.right.girl;


import com.ian.observer.example2.right.boy.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2019/8/22.
 * Project : DesignPatterns
 */

public class Girl implements Subject {

    private List<Observer> boys;

    public Girl() {
        boys = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer boy) {
        boys.add(boy);
    }

    @Override
    public void removeObserver(Observer boy) {
        boys.remove(boy);
    }

    @Override
    public void notifyObserver() {
        for (Observer boy : boys) {
            boy.update();
        }
    }

    public void hungry() {
        System.out.println("女神:我饿了");
        notifyObserver();
    }
}
