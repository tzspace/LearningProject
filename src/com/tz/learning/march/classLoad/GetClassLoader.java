package com.tz.learning.march.classLoad;

public class GetClassLoader {
    public static void main(String[] args){
        ClassLoader cl = ClassLoadTest.class.getClassLoader();

        while(cl != null){
            System.out.println(cl);
            cl = cl.getParent();
        }
    }
}
