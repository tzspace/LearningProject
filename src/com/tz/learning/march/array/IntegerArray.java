package com.tz.learning.march.array;

public class IntegerArray {
    public static void main(String[] args){
        Integer[] integerArrays = new Integer[3];
        int[] intArray = new int[3];
        for(Integer i : integerArrays){
            System.out.println("integer:" + i);
        }

        for(int ii : intArray){
            System.out.println("int:" + ii);
        }

        integerArrays[0] = 1;
        integerArrays[1] = 1000;
        integerArrays[2] = 10000;

        for(Integer j : integerArrays){
            System.out.println("integerArray:" + j);
        }
    }
}
