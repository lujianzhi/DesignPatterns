package com.ian.composite.expamle.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ian.Lu on 2017/10/9.
 * Project : DesignPatterns
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList;
    private String name;

    public Menu(String name) {
        this.name = name;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void get(int index) {
        menuComponentList.get(index);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("菜单：" + name + "；包含菜目：");
        Iterator<MenuComponent> menuComponentIterator = menuComponentList.iterator();
        while (menuComponentIterator.hasNext()) {
            MenuComponent menuComponent = menuComponentIterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator getIterator() {
        return menuComponentList.iterator();
    }
}
