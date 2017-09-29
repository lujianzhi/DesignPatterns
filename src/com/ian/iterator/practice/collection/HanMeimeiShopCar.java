package com.ian.iterator.practice.collection;

import com.ian.iterator.practice.iterator.HanMeimeiShopCarIterator;
import com.ian.iterator.practice.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/9/29.
 * Project : DesignPatterns
 */
public class HanMeimeiShopCar implements ShopCar<String> {

    private List<String> goodsList;

    public HanMeimeiShopCar() {
        goodsList = new ArrayList<>();
        goodsList.add("洗面奶");
        goodsList.add("口红");
        goodsList.add("连衣裙");
        goodsList.add("粉底");
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
        return new HanMeimeiShopCarIterator(goodsList);
    }
}
