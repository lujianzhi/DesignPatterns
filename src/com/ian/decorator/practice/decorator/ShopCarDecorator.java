package com.ian.decorator.practice.decorator;

import com.ian.decorator.practice.component.ComponentShopCar;

/**
 * Created by Ian.Lu on 2017/9/21.
 * Project : DesignPatterns
 */
public abstract class ShopCarDecorator extends ComponentShopCar {

    private ComponentShopCar componentShopCar;

    public ShopCarDecorator(ComponentShopCar componentShopCar) {
        this.componentShopCar = componentShopCar;
    }

    @Override
    public void shopCar() {
        componentShopCar.shopCar();
    }

}
