package com.ian.iterator.example.menu;

import com.ian.iterator.example.entity.MenuItem;
import com.ian.iterator.example.iterator.DinerMenuIterator;
import com.ian.iterator.example.iterator.Iterator;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public class DinerMenu implements IMenu {

    private final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("青菜", "10", "新鲜的青菜午饭");
        addItem("红烧肉", "30", "好吃的红烧肉");
        addItem("小鸡炖蘑菇", "20", "田园风的小鸡炖蘑菇");
    }

    private void addItem(String name, String price, String detail) {
        MenuItem menuItem = new MenuItem(name, price, detail);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("不能再添加了");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
