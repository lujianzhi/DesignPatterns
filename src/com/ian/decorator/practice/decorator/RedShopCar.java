package com.ian.decorator.practice.decorator;

import com.ian.decorator.practice.component.ComponentShopCar;

/**
 * Created by Ian.Lu on 2017/9/21.
 * Project : DesignPatterns
 */
public class RedShopCar extends ShopCarDecorator {
    public RedShopCar(ComponentShopCar componentShopCar) {
        super(componentShopCar);
    }

    @Override
    public void shopCar() {
        super.shopCar();
        redColor();
    }

    private void redColor() {
        System.out.println("红色的外观");
    }
}
