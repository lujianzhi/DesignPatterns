package com.ian.iterator.example.iterator;

import com.ian.iterator.example.entity.MenuItem;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int index = 0;
    private int length;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        if (menuItems != null) {
            length = menuItems.length;
        }
    }

    @Override
    public boolean hasNext() {
        if (index >= length || menuItems[index] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }
}
