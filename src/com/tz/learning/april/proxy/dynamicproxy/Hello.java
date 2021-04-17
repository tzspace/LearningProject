package com.tz.learning.april.proxy.dynamicproxy;

public class Hello implements HelloInterface{
    @Override
    public void SayHello() {
        System.out.println("Hello Ted");
    }
}
