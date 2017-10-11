package com.ian.proxy.example.staticproxy;

/**
 * Created by Ian.Lu on 2017/10/11.
 * Project : DesignPatterns
 */
public class ProxyStaticSubject implements IStaticSubject {

    private IStaticSubject realSubject;

    public ProxyStaticSubject(IStaticSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void sayName() {
        System.out.println("代理开始执行");
        realSubject.sayName();
        System.out.println("代理执行结束");
    }
}
