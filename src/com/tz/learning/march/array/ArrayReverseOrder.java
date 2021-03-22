package com.tz.learning.march.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverseOrder {

    public static void main(String[] args){
        Integer[] integer = new Integer[]{65,1,26,3,90,87};
        Arrays.sort(integer, Collections.reverseOrder());

        for(Integer i : integer){
            System.out.println(i);
        }
    }
}
