package com.tz.learning.march.practice.defineArrayListAndShowVisitor;

import java.util.Arrays;

public class ArrayList {
    private Object[] list;
    private int next = 0;
    private int defaultGuestCount;

    ArrayList(int defaultGuestCount){
        list = new Object[defaultGuestCount];
        this.defaultGuestCount = defaultGuestCount;
    }

    int size(){
        return next;
    }

    void add(Object o){
        if(this.next == this.defaultGuestCount){
            list = Arrays.copyOf(list, list.length*2);
            defaultGuestCount = list.length;
            System.out.println("Current can be stored guest count is: " + defaultGuestCount);
        }
        list[next++] = o;
    }

    Object get(int index){
        return list[index];
    }
}
