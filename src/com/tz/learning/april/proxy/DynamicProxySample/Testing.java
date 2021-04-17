package com.tz.learning.april.proxy.DynamicProxySample;

import com.tz.learning.april.Package.LoggerTesting;

import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Testing {
    public static void main(String[] args) {
        Ticket customer = new Customer();
        Ticket ticket = (Ticket) Proxy.newProxyInstance(customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(), new DynamicProxyHandle(customer));
        /*Logger logger = Logger.getLogger(customer.getClass().getName());
        logger.setLevel(Level.WARNING);
        logger.log(Level.WARNING, "hello:");*/
        ticket.sell();
    }
}
