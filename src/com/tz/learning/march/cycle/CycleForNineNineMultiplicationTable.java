package com.tz.learning.march.cycle;

public class CycleForNineNineMultiplicationTable {
    public static void main(String[] args){
        int[] integerArray = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.printf("%s%n","九九乘法表:");
        for(int i : integerArray){
            for(int j : integerArray){
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            }
            System.out.println();
        }
    }
}
