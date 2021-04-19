package com.tz.learning.march.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTraining {

    //Set用于存储无序（存入和取出的顺序不一定相同）元素，值不能重复
    public static void main(String[] args){
        Set set = new HashSet();
        set.add("苹果");
        set.add("雪梨");
        set.add("香蕉");
        set.add("榴莲");
        set.add("葡萄");
        set.add("葡萄"); // will not add into set

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
