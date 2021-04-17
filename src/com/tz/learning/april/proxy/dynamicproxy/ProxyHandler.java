package com.tz.learning.april.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object object;
    ProxyHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Start proxy....");
        method.invoke(object, args);
        System.out.println("Finish proxy....");
        return null;
    }
}
