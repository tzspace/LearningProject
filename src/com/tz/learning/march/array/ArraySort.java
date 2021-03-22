package com.tz.learning.march.array;

import com.sun.tools.hat.internal.util.Comparer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args){
        int[] number = {12,4,65,33,5,8,9,10,39,99};
        Arrays.sort(number);

        for(int i : number){
            System.out.println(i + " ");
        }
    }
}
