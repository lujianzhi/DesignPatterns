package com.ian.iterator.example.entity;

import com.ian.composite.expamle.component.MenuComponent;
import com.ian.iterator.example.iterator.Iterator;
import com.ian.iterator.example.menu.IMenu;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public class Waitress {
    private IMenu dinerMenu;
    private IMenu pancakeHouseMenu;

    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public Waitress(IMenu dinerMenu, IMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        System.out.println("午餐菜单");
        iteratorMenu(dinerMenu.createIterator());
        System.out.println("早餐菜单");
        iteratorMenu(pancakeHouseMenu.createIterator());
    }

    public void printAllMenu(){
        java.util.Iterator iterator = menuComponent.getIterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent1 = (MenuComponent) iterator.next();
            menuComponent1.print();
        }
    }

    private void iteratorMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
