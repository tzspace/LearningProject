package com.tz.learning.march.linkedlist.SimpleLinkedList;

public class SimpleLinkedList {
    private class Node{
        Node(Object c){
            this.o = c;
        }
        Object o;
        Node next;
    }

    private Node first;

    public void add(Object elem){
        Node node = new Node(elem);
        if(first == null){
            first = node;
        }
        else{
            append(node);
        }
    }

    private void append(Node node){
        Node last = first;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
    }

    public int size(){
        int count = 0;
        Node last = first;
        while(last != null){
            last = last.next;
            count++ ;
        }
        return count;
    }

    public Object get(int index){
        checkSize(index);
        return findElementOf(index);
    }

    private void checkSize(int index) throws IndexOutOfBoundsException {
        int size = size();
        if(index >= size){
            throw new IndexOutOfBoundsException(
                String.format("Index: %d, Size: %d", index, size)
            );
        }
    }

    private Object findElementOf(int index){
        int count = 0;
        Node last = first;
        while(count < index){
            last = last.next;
            count++;
        }
        return last.o;
    }
}
