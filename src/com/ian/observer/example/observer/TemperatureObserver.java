package com.ian.observer.example.observer;

import com.ian.observer.example.subject.Subject;
import com.ian.observer.example.subject.WeatherData;

/**
 * Created by Ian.Lu on 2017/1/8.
 * Project : DesignPatterns
 */
public class TemperatureObserver implements Observer, IDisplay {

    private WeatherData subject;

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            this.subject = (WeatherData) subject;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("气温显示牌显示气温 : " + subject.getTemperature());
    }
}
