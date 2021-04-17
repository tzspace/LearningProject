package com.tz.learning.april.proxy.CGLibDynamicProxySample;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDynamicProxy implements MethodInterceptor {
    private Object obj;
    CGLibDynamicProxy(Object obj){
        this.obj = obj;
    }

    public Object getProxyInstance(Class targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始cglib代理...");
        //method.invoke(obj);
        Object returnValue = method.invoke(this.obj, objects);
        System.out.print("结束cglib代理...");

        return null;
    }
}
