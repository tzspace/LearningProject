package com.tz.learning.march.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperation {
    public static void main(String[] args){
        List integerList = new ArrayList();
        integerList.add(-3);
        integerList.add(0);
        integerList.add(12);
        integerList.add(1);
        integerList.add(-5);

        //打印当前integerList
        System.out.println(integerList);
        //打印当前最大值
        System.out.println(Collections.max(integerList));
        //打印当前最小值
        System.out.println(Collections.min(integerList));
        //用10替换所有当前值1
        Collections.replaceAll(integerList, 1, 10);
        System.out.println(integerList);
        //找出12在当前出现的次数
        System.out.println(Collections.frequency(integerList, 12));
        //把当前的integerList按反序排列
        Collections.reverse(integerList);
        System.out.println(integerList);
        //把索引为0的3的值互换位置
        Collections.swap(integerList, 0, 3);
        System.out.println(integerList);
        //把当前integerList从小到大排序
        Collections.sort(integerList);
        System.out.println(integerList);
        //把当前的integerList洗牌
        Collections.shuffle(integerList);
        System.out.println(integerList);

        //使用copy将指定集合中的元素复制到另外一个元素
        List<Integer> source = new ArrayList<>();
        source.add(88);
        source.add(77);
        Collections.copy(integerList, source);
        System.out.println(integerList);
    }
}
