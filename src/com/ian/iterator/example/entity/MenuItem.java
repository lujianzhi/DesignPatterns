package com.ian.iterator.example.entity;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public class MenuItem {

    private String name;
    private String price;
    private String detail;

    public MenuItem(String name, String price, String detail) {
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
