package com.ian.observer.practice.observable;

import com.ian.observer.practice.observer.Observer;

/**
 * Created by Ian.Lu on 2017/9/20.
 * Project : DesignPatterns
 */
public interface Observable {

    void registerObserver(Observer observer);

    void unRegisterObserver(Observer observer);

    void notifyObservers();

    void addThings(String things);

    void setDataHasChanged();
}
