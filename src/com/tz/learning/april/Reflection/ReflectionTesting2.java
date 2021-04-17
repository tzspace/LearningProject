package com.tz.learning.april.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionTesting3{
    static {
        System.out.println("Hi, I'm static block.");
    }

    ReflectionTesting3(){}

    ReflectionTesting3(int count){
        this.count = count;
    }

    private int count;

    public int getCount() {
        return count;
    }
}
public class ReflectionTesting2 {


    public static void main(String[] args) throws Exception {
        Class rt3 = Class.forName("com.tz.learning.april.Reflection.ReflectionTesting3",
                false, ReflectionTesting2.class.getClassLoader());
        Method[] methods = rt3.getDeclaredMethods();
        Object o = rt3.getDeclaredConstructor().newInstance();
        for(Method method : methods){
            System.out.printf("\t%s%n",Modifier.toString(method.getModifiers()));
            System.out.printf("\t%s%n",method.getReturnType().getName());
            System.out.printf("\t%s%n",method.getName());

            /*Modifier.toString(method.getModifiers()),
                    method.getReturnType().getName(),
            method.getName());*/
        }
        System.out.println("已载入ReflectionTesting2 class");
        ReflectionTesting3 rt33;
        System.out.println("声明Reflection3对象");
        rt33 = new ReflectionTesting3();
        System.out.println("生成Reflection3实例");

        Package prt3 = ReflectionTesting3.class.getPackage();
        System.out.printf("ReflectionTesting3的包名是: %s%n", prt3.getName());
    }
}
