package com.ian.observer.example.observer;

import com.ian.observer.example.subject.Subject;

/**
 * Created by Ian.Lu on 2017/1/8.
 * Project : DesignPatterns
 */
public interface Observer {

    void update(Subject subject);
}
