package com.ian.observer.practice.observable;

import com.ian.observer.practice.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/9/20.
 * Project : DesignPatterns
 */
public class WalMart implements Observable {
    private List<Observer> walMartObservers;
    private boolean dataHasChanged;

    private StringBuilder sb;

    public WalMart() {
        walMartObservers = new ArrayList<>();
        sb = new StringBuilder("沃尔玛超市商品 : A ; B");
    }

    @Override
    public void addThings(String things) {
        sb.append(" ; 新增的" + things);
        setDataHasChanged();
    }

    public StringBuilder getSb() {
        return sb;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!walMartObservers.contains(observer)) {
            walMartObservers.add(observer);
        }
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (walMartObservers.contains(observer)) {
            walMartObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if (dataHasChanged) {
            for (Observer observer : walMartObservers) {
                observer.update(this);
            }
            dataHasChanged = false;
        }
    }

    @Override
    public void setDataHasChanged() {
        dataHasChanged = true;
    }
}
