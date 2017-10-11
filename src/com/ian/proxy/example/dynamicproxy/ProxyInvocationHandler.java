package com.ian.proxy.example.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Ian.Lu on 2017/10/11.
 * Project : DesignPatterns
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object object;

    public ProxyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始");
        Object result = method.invoke(object, args);
        System.out.println("动态代理结束");
        return result;
    }

    /**
     * 生成代理对象
     */
    public Object getProxy() {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?>[] interfaces = new Class[]{IDynamicSubject.class};
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
