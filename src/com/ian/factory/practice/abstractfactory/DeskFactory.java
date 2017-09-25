package com.ian.factory.practice.abstractfactory;

import com.ian.factory.practice.been.Desk;
import com.ian.factory.practice.been.DeskB;
import com.ian.factory.practice.been.Product;
import com.ian.factory.practice.been.ProductB;

/**
 * Created by Ian.Lu on 2017/9/24.
 * Project : DesignPatterns
 */
public class DeskFactory extends AbstractFactory {
    @Override
    public Product getProduct() {
        return new Desk();
    }

    @Override
    public ProductB getProductB() {
        return new DeskB();
    }
}
