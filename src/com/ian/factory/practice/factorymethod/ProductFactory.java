package com.ian.factory.practice.factorymethod;

import com.ian.factory.practice.been.Product;

/**
 * Created by Ian.Lu on 2017/9/22.
 * Project : DesignPatterns
 */
public abstract class ProductFactory {

    public abstract <T extends Product> T createProduct(Class<T> clz);

    public abstract Product createProduct();
}
