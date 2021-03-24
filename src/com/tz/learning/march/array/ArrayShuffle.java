package com.tz.learning.march.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
    //洗牌算法： https://blog.csdn.net/zhanggonglalala/article/details/103197411
    public static void main(String[] args){
        char[] style = new char[]{'桃','砖','心','梅'};
        String[] number = new String[]{"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<String> list = new ArrayList();
        for(char i: style){
            for(String j: number){
                list.add(i + " " + j + " ");
            }
        }
        Collections.shuffle(list);
        for(String item: list){
            System.out.print(item);
        }
    }

    /*public static void main(String[] args){
        char[] style = new char[]{'桃','砖','心','梅'};
        String[] number = new String[]{"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        Collections.shuffle(Arrays.asList(style));
        Collections.shuffle(Arrays.asList(number));
        for(char i: style){
            for(String j: number){
                System.out.print(i + " " + j + " ");//list.add(i + " " + j + " ");
            }
        }
    }*/
}
