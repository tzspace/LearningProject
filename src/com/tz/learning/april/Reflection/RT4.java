package com.tz.learning.april.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RT4 {
    public static void main(String[] args) throws Exception {
        Class clz = Class.forName("com.tz.learning.april.Reflection.Student");
        Constructor constructor = clz.getConstructor(String.class, Integer.class);
        Object object = constructor.newInstance();
        Method setter = clz.getMethod("setName", String.class);
        setter.invoke(object, "testing");
        Method getter = clz.getMethod("getName");
        System.out.println(getter.invoke(object));
    }
}
