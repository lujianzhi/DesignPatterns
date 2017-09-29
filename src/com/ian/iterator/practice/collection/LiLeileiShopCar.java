package com.ian.iterator.practice.collection;

import com.ian.iterator.practice.iterator.Iterator;
import com.ian.iterator.practice.iterator.LiLeileiShopCarIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/9/29.
 * Project : DesignPatterns
 */
public class LiLeileiShopCar implements ShopCar<String> {

    private List<String> goodsList;

    public LiLeileiShopCar() {
        goodsList = new ArrayList<>();
        goodsList.add("篮球");
        goodsList.add("啤酒");
        goodsList.add("香烟");
    }

    @Override
    public void addItem(String goods) {
        if (!goodsList.contains(goods)) {
            goodsList.add(goods);
        }
    }

    @Override
    public void remove(String goods) {
        if (goodsList.contains(goods)) {
            goodsList.remove(goods);
        }
    }

    @Override
    public Iterator<String> getIterator() {
        return new LiLeileiShopCarIterator(goodsList);
    }
}
