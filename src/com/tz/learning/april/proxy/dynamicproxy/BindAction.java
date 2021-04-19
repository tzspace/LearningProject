package com.tz.learning.april.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class BindAction {
    public static Object Bind(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new ProxyHandler(target));
    }
}
