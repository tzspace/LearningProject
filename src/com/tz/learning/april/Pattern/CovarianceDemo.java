package com.tz.learning.april.Pattern;

public class CovarianceDemo {
    public static void main(String[] args) {
        Node<Apple> apple1 = new Node<>(new Apple(), null);
        Node<Apple> apple2 = new Node<>(new Apple(), apple1);
        Node<Apple> apple3 = new Node<>(new Apple(), apple2);

        Node<Banana> banana1 = new Node<>(new Banana(), null);
        Node<Banana> banana2 = new Node<>(new Banana(), banana1 );

        show(apple3);
        show(banana2);
    }

    /*public static void show(Node<? extends Fruits> value){
        Node<? extends Fruits> node = value;
        do{
            System.out.println(node.value);
            node = node.next;
        } while(node != null);
    }*/
    public static void show(Node<? extends Fruits> value){
        Node<? extends  Fruits> node = value;
        do{
            System.out.println(node.value);
            node = node.next;
        } while(node != null);
    }
}
