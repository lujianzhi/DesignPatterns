package com.ian.factory.practice.abstractfactory;

import com.ian.factory.practice.been.Book;
import com.ian.factory.practice.been.BookB;
import com.ian.factory.practice.been.Product;
import com.ian.factory.practice.been.ProductB;

/**
 * Created by Ian.Lu on 2017/9/24.
 * Project : DesignPatterns
 */
public class BookFactory extends AbstractFactory {
    @Override
    public Product getProduct() {
        return new Book();
    }

    @Override
    public ProductB getProductB() {
        return new BookB();
    }
}
