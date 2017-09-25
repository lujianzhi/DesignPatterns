package com.ian.factory.practice.factorymethod;

import com.ian.factory.practice.been.Book;
import com.ian.factory.practice.been.Product;

/**
 * Created by Ian.Lu on 2017/9/22.
 * Project : DesignPatterns
 */
public class WalMartFactory extends ProductFactory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }

    @Override
    public Product createProduct() {
        return new Book("Book");
    }
}
