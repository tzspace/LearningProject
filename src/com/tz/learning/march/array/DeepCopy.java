package com.tz.learning.march.array;

import java.io.StringBufferInputStream;

public class DeepCopy {

    public static void main(String[] args){
        Clothes1[] arr1 = new Clothes1[]{new Clothes1("red", 'L'),  new Clothes1("blue",'M')};
        Clothes1[] arr2 = new Clothes1[arr1.length];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = new Clothes1(arr1[i].color, arr1[i].size);
        }

        arr1[0].color = "yellow";
        System.out.println(arr2[0].color);
        System.out.println(arr1[0].color);
    }
}

class Clothes1{
    String color;
    char size;
    Clothes1(String color, char size){
        this.color = color;
        this.size = size;
    }
}
