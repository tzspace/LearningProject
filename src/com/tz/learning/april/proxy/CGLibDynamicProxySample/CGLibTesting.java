package com.tz.learning.april.proxy.CGLibDynamicProxySample;

public class CGLibTesting {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Customer proxy = (Customer) new CGLibDynamicProxy(customer).getProxyInstance(customer.getClass());
        proxy.BuyTicket();
    }
}
