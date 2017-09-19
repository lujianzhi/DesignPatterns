package com.ian.composite.expamle.component;

import com.ian.composite.expamle.exception.UnSupportException;

/**
 * Created by Ian.Lu on 2017/2/6.
 * Project : DesignPatterns
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
    }

    public void get(int index) {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
    }

    public void remove(MenuComponent menuComponent) {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
        return "";
    }

    public double getPrice() {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    public boolean isVegetarian() {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void print() {
        try {
            throw new UnSupportException("不支持该操作");
        } catch (UnSupportException e) {
            e.printStackTrace();
        }
    }
}
