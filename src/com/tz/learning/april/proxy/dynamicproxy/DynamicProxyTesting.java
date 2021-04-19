package com.tz.learning.april.proxy.dynamicproxy;

import com.tz.learning.april.proxy.staticproxy.HelloProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTesting {
    public static void main(String[] args) {
        Hello hello = new Hello();
        //ProxyHandler proxyHandler = new ProxyHandler(hello);
        HelloInterface proxy = (HelloInterface) BindAction.Bind(hello);
        /*HelloInterface proxy = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), proxyHandler);*/

        proxy.SayHello();
    }
}
