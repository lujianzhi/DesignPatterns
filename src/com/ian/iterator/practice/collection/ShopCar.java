package com.ian.iterator.practice.collection;

import com.ian.iterator.practice.iterator.Iterator;

/**
 * Created by Ian.Lu on 2017/9/29.
 * Project : DesignPatterns
 */
public interface ShopCar<T>{

    void addItem(T goods);

    void remove(T goods);

    Iterator<T> getIterator();

}
