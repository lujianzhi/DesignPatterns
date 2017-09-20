package com.ian.observer.practice.observable;

import com.ian.observer.practice.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/9/20.
 * Project : DesignPatterns
 */
public class HuaLian implements Observable {
    private List<Observer> huaLianObservers;
    private boolean dataHasChanged;

    private StringBuilder sb;

    public HuaLian() {
        huaLianObservers = new ArrayList<>();
        sb = new StringBuilder("华联超市商品 : A ; B");
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
        if (!huaLianObservers.contains(observer)) {
            huaLianObservers.add(observer);
        }
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (huaLianObservers.contains(observer)) {
            huaLianObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if (dataHasChanged) {
            for (Observer observer : huaLianObservers) {
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
