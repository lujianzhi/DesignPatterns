package com.ian.iterator.example.iterator;

import com.ian.iterator.example.entity.MenuItem;

import java.util.ArrayList;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int index;
    private int size;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        size = menuItems.size();
        abc();
    }

    @Override
    public boolean hasNext() {
        if (index >= size || menuItems.get(index) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(index);
        index++;
        return menuItem;
    }
}
