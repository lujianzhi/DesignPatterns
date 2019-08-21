package com.ian.observer.example2.right.girl;


import com.ian.observer.example2.right.boy.Observer;

/**
 * Created by Ian.Lu on 2019/8/22.
 * Project : DesignPatterns
 */

public interface Subject {
    void addObserver(Observer boy);

    void removeObserver(Observer boy);

    void notifyObserver();
}
