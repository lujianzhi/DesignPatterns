package com.ian.observer.example.subject;

import com.ian.observer.example.observer.Observer;

/**
 * Created by Ian.Lu on 2017/1/8.
 * Project : DesignPatterns
 */
public interface Subject {

    void registerObserver(Observer observer);

    void disRegisterObserver(Observer observer);

    void notifyObservers();

    void setChanged();
}
