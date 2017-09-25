package com.ian.factory.practice.abstractfactory;

import com.ian.factory.practice.been.Product;
import com.ian.factory.practice.been.ProductB;

/**
 * Created by Ian.Lu on 2017/9/24.
 * Project : DesignPatterns
 */
public abstract class AbstractFactory {

    public abstract Product getProduct();

    public abstract ProductB getProductB();
}
