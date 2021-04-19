package com.tz.learning.march.set;

import java.util.Set;
import java.util.TreeSet;

public class treeSetTrainingElementCompare {
    public static void main(String[] args){

        //有一批数据，要求不能有重复数据并且要排序
        //ArrayList, LinkedList不能去掉重复数据
        //HashSet可以去掉重复，但是是无序
        //所以应该使用过TreeSet

        //元素自然排序，也称作自然排序（实现Comparable接口，Override(覆盖)CompareTo()方法）
        Set treeSet = new TreeSet();
        treeSet.add(new Person("小明", 20, '男'));
        treeSet.add(new Person("小曾", 20, '男'));
        treeSet.add(new Person("小陆", 25, '男'));
        treeSet.add(new Person("小陆", 25, '男'));
        treeSet.add(new Person("小芳", 30, '男'));
        treeSet.add(new Person("小郭", 18, '女'));

        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }

     static class Person implements Comparable  {
        String name;
        int age;
        char sex;

        Person(String name, int age, char sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public int hashCode(){
            return this.name.hashCode() + age * 37;
        }

        public boolean equals(Object obj){
            System.err.println(this + "equals:" + obj);
            if(obj instanceof treeSetTrainingElementCompare.Person){
                treeSetTrainingElementCompare.Person person = (treeSetTrainingElementCompare.Person) obj;
                return this.name.equals(person.name) && this.age == person.age;
            }
            return false;
        }

        @Override
        public int compareTo(Object obj){
            treeSetTrainingElementCompare.Person person = (Person) obj;
            System.out.println(this + " CompareTo " + person);
            if(this.age > person.age){
                return 1;
            }
            if(this.age < person.age){
                return -1;
            }
            return this.name.compareTo(person.name);
        }

        public String toString(){
            return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
        }
    }
}
