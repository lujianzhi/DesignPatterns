package com.ian.templatemethod.practice;

/**
 * Created by Ian.Lu on 2017/9/27.
 * Project : DesignPatterns
 */
public abstract class DressUp {

    /**
     * 有final修饰
     */
    public final void dressUp() {
        dressHat();
        dressCloth();
        if (needPants()) {
            dressPants();
        }
    }

    abstract void dressHat();

    abstract void dressCloth();

    abstract void dressPants();

    protected boolean needPants() {
        return true;
    }
}
