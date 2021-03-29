package com.tz.learning.march.practice.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetTesting {
    public static void main(String[] args){
        String a = new String("A");
        String b = new String("A");
        CustomString c = new CustomString("B");
        CustomString d = new CustomString("B");


        System.out.println("a == b  ==" + a == b);
        System.out.println("a.equals(b) ==" + a.equals(b));
        //System.out.println("c == d  ==" + c == d);
        System.out.println("c.equals(d) ==" + c.equals(d));

        Set<Object> set = new HashSet<Object>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);

        System.out.println("set size is: " + set.size());
        for(Object item : set){
            System.out.println(item);
        }

    }
}
