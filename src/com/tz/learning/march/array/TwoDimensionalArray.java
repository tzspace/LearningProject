package com.tz.learning.march.array;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int[][] array = {
                {1,3,5,7,9},
                {2,4,6,8,10}
        };

        /*for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }*/
        for(int[] a : array){
            for(int b : a){
                System.out.println(b);
            }
        }
    }
}
