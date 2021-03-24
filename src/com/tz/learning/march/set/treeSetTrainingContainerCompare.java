package com.tz.learning.march.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treeSetTrainingContainerCompare {
    public static void main(String[] args){
        //让容器自身具备比较性
        //实现接口Comparator, 覆盖compare()方法, 并将该接口的子类对象作为参数传递给TreeSet的构造函数

        Set treeSetContainer = new TreeSet(new MyComparator());
        treeSetContainer.add(new Book("c#", 99.9));
        treeSetContainer.add(new Book("java", 122.9));
        treeSetContainer.add(new Book("js", 88.0));
        treeSetContainer.add(new Book("python", 66));
        treeSetContainer.add(new Book("c++", 199.9));

        System.out.println(treeSetContainer);
        System.out.println(treeSetContainer.size());

    }

    static class MyComparator implements Comparator{
        public int compare(Object obj1, Object obj2){
            Book b1 = (Book) obj1;
            Book b2 = (Book) obj2;
            System.out.println(b1 + " comparator " + b2);
            if(b1.price > b2.price){
                return 1;
            }
            if(b1.price < b2.price){
                return -1;
            }
            return b1.name.compareTo(b2.name);
        }
    }

    static class Book{
        public String name;
        public double price;

        public Book(String name, double price){
            this.name = name;
            this.price = price;
        }

        public String toString(){
            return "Book [name=" + name + ", price=" + price + "]";
        }

    }
}
