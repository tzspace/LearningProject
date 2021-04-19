package com.tz.learning.march.practice.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    private Deque elems = new ArrayDeque();
    private int capacity;

    Stack(int count){
        this.capacity = count;
    }

    public boolean push(Object element){
        if(isFull()) return false;

        return elems.offerLast(element);
    }

    public boolean isFull(){
        return elems.size() + 1 > capacity ;
    }

    public String pop(){
        if(peek() != null) {
            return (String) elems.pollLast();
        }
        return "";
    }

    public Object peek(){
        return elems.peekLast();
    }

    public static void main(String[] args){
        Stack stack = new Stack(2);
        stack.push ("Justin");
        stack.push ("Monica");
        stack.push ("Trene");
        System.out.println(stack.pop());
        System.out .println(stack.pop());
        System.out.println(stack.pop());
    }
}
