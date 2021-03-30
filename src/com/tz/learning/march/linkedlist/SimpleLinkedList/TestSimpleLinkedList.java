package com.tz.learning.march.linkedlist.SimpleLinkedList;

public class TestSimpleLinkedList {
    public static void main(String[] args){
        SimpleLinkedList sll = new SimpleLinkedList();
        sll.add('a');
        sll.add('b');
        sll.add('c');
        sll.add('d');
        sll.add('e');

        System.out.println("Size is: " + sll.size());
        System.out.println("Size is: " + sll.get(4));
    }
}
