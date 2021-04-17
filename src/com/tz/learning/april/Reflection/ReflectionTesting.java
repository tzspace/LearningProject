package com.tz.learning.april.Reflection;

import com.tz.learning.april.Package.LoggerTesting;

public class ReflectionTesting {
    public static void main(String[] args) throws ClassNotFoundException {
        Class str = String.class;
        int a = 1;
        System.out.printf("类名称: %s%n", str.getName());
        System.out.printf("是否为接口: %s%n", str.isInterface());
        System.out.printf("是否为基本类型: %s%n", str.isPrimitive());
        System.out.printf("是否为数组对象: %s%n", str.isArray());
        System.out.printf("父类名称: %s%n", str.getSuperclass().getName());
        System.out.println("".getClass());


        Class cla = Class.forName("com.tz.learning.april.Package.LoggerTesting");
        System.out.printf("类名称: %s%n", cla.getName());
        System.out.printf("是否为接口: %s%n", cla.isInterface());
        System.out.printf("是否为基本类型: %s%n", cla.isPrimitive());
        System.out.printf("是否为数组对象: %s%n", cla.isArray());
        System.out.printf("父类名称: %s%n", cla.getSuperclass().getName());

        Class c = LoggerTesting.class;
        System.out.printf("类名称: %s%n", c.getName());
        System.out.printf("是否为接口: %s%n", c.isInterface());
        System.out.printf("是否为基本类型: %s%n", c.isPrimitive());
        System.out.printf("是否为数组对象: %s%n", c.isArray());
        System.out.printf("父类名称: %s%n", c.getSuperclass().getName());

    }
}
