package com.tz.learning.march.practice;

import java.util.ArrayList;
import java.util.List;

public class commonshuixianhuashu {
    public static void main(String[] args){
        //获取三位数的水仙花数，即比如： 1的三次方+5的三次方+3的三次方 = 153
        List<Integer> result = GetShuiXianHuaResult();
        for(int i : result){
            System.out.printf("符合条件的三位数有：%d%n", i);
        }
    }

    public static List<Integer> GetShuiXianHuaResult(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 100; i < 1000; i++){
            int h = i/100;
            int t = i%100/10;
            int g = i%10;
            System.out.printf("i: %d%n", i);
            System.out.printf("h: %d%n", h);
            System.out.printf("t: %d%n", t);
            System.out.printf("g: %d%n", g);
            if(h*h*h+t*t*t+g*g*g == i){
                list.add(i);
            }
        }

        return list;
    }
}
