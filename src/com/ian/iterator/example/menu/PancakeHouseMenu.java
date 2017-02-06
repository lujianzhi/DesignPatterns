package com.ian.iterator.example.menu;

import com.ian.iterator.example.entity.MenuItem;
import com.ian.iterator.example.iterator.Iterator;
import com.ian.iterator.example.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public class PancakeHouseMenu implements IMenu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("豆浆", "1.5", "早上喝的豆浆");
        addItem("煎饼", "2", "好吃健康的煎饼");
        addItem("小笼包", "5", "美味的小笼包");
    }

    private void addItem(String name, String price, String detail) {
        MenuItem menuItem = new MenuItem(name, price, detail);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

}
