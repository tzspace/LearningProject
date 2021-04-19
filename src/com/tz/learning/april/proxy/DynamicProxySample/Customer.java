package com.tz.learning.april.proxy.DynamicProxySample;

public class Customer implements Ticket{
    @Override
    public void sell() {
        System.out.println("我在买电影票");
    }
}
