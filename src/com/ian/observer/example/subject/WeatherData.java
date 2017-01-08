package com.ian.observer.example.subject;

import com.ian.observer.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/1/8.
 * Project : DesignPatterns
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;

    private int temperature;
    private int humidity;
    private int pressure;

    private boolean isChanged;

    public WeatherData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void disRegisterObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        if (isChanged) {
            for (Observer observer : observerList) {
                observer.update(this);
            }
            isChanged = false;
        } else {
            System.out.println("isChanged为false");
        }
    }

    @Override
    public void setChanged() {
        isChanged = true;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
