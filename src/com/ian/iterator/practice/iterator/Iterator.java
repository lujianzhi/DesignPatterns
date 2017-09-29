package com.ian.iterator.practice.iterator;

/**
 * Created by Ian.Lu on 2017/9/29.
 * Project : DesignPatterns
 */
public interface Iterator<T> {

    /**
     * 有下一个元素
     */
    boolean hasNext();

    /**
     * 获取数据
     */
    T get();
}
