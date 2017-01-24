package com.ian.adapter.example;

import com.ian.adapter.example.entity.Bird;
import com.ian.adapter.example.entity.IDuck;

/**
 * Created by Ian.Lu on 2017/1/20.
 * Project : DesignPatterns
 */
public class ChangeToDuckAdapter implements IDuck {

    private Bird bird;

    public ChangeToDuckAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void quack() {
        bird.chirp();
    }

    @Override
    public void fly() {
        bird.fly();
    }
}
