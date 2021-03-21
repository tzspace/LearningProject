package com.tz.learning.march.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        Integer[] a = new Integer[]{1,2,3,4,5,6};
        Integer[] b = Arrays.copyOf(a, a.length);

        for(Integer i : b){
            System.out.printf("b:%d%n", i);
        }

        for(Integer j : a){
            System.out.printf("a:%d%n", j);
        }

        b[0] = 11;
        for(Integer k : a){
            System.out.printf("k:%d%n", k);
        }

        for(Integer l : b){
            System.out.printf("l:%d%n", l);
        }

    }
}
