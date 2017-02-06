package com.ian.iterator.example.iterator;

import com.ian.iterator.example.entity.MenuItem;

/**
 * Created by Ian.Lu on 2017/2/1.
 * Project : DesignPatterns
 */
public interface Iterator {

    boolean hasNext();

    MenuItem next();
}
