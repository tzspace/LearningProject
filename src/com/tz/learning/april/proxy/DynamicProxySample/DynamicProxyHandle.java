package com.tz.learning.april.proxy.DynamicProxySample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandle implements InvocationHandler {
    private Object obj;

    DynamicProxyHandle(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new DynamicProxyHandle(obj));*/
        System.out.println("代理开始...");
        method.invoke(obj);
        System.out.println("代理结束...");

        return null;
    }
}
