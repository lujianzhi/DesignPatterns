package com.ian.strategy.practice.two.entity;

import com.ian.strategy.practice.two.model.Cloth;
import com.ian.strategy.practice.two.model.Glasses;

/**
 * Created by Ian.Lu on 2017/9/19.
 * Project : DesignPatterns
 */
public abstract class Person {

    //衣服
    private Cloth cloth;

    //眼镜
    private Glasses glasses;

    /**
     * 外出
     */
    public void goOut() {
        sayHello();
        myCloth();
        myGlasses();
    }

    /**
     * 自我介绍
     */
    abstract void sayHello();

    private void myCloth() {
        if (cloth != null) {
            System.out.println("我穿着" + cloth.display());
        } else {
            System.out.println("我没穿衣服");
        }
    }

    private void myGlasses() {
        if (glasses != null) {
            System.out.println("我戴着" + glasses.display());
        } else {
            System.out.println("我没戴眼镜");
        }
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public void setGlasses(Glasses glasses) {
        this.glasses = glasses;
    }
}
