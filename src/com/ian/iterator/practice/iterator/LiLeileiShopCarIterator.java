package com.ian.iterator.practice.iterator;

import java.util.List;

/**
 * Created by Ian.Lu on 2017/9/29.
 * Project : DesignPatterns
 */
public class LiLeileiShopCarIterator implements Iterator<String> {

    private List<String> goods;
    private int index = 0;

    public LiLeileiShopCarIterator(List<String> goods) {
        this.goods = goods;
    }

    @Override
    public boolean hasNext() {
        return index < goods.size();
    }

    @Override
    public String get() {
        return goods.get(index++);
    }
}