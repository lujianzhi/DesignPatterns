package com.ian.decorator.practice.decorator;

import com.ian.decorator.practice.component.ComponentShopCar;

/**
 * Created by Ian.Lu on 2017/9/21.
 * Project : DesignPatterns
 */
public class FourWheelsShopCar extends ShopCarDecorator {
    public FourWheelsShopCar(ComponentShopCar componentShopCar) {
        super(componentShopCar);
    }

    @Override
    public void shopCar() {
        super.shopCar();
        fourWheels();
    }

    private void fourWheels() {
        System.out.println("四个轮子");
    }
}
