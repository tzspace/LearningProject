package com.tz.learning.march.set;

import java.util.HashSet;
import java.util.Iterator;

//HashSet按照hash来存/取，不存入重复的元素规则（使用hashcode 和 equals）
//对比结果，如果hashcode相同，equals为false的会在同样的哈希值顺延存放
//线程不安全，存取速度快，底层是以哈希表实现的
//HashSet存储元素的顺序不是按照存入时候的顺序
public class HashSetTraining {
    public static void main(String[] args){
        HashSet hashSet = new HashSet<String>();
        hashSet.add(new Person("小明",20));
        hashSet.add(new Person("小陆",21));
        hashSet.add(new Person("小芳",22));
        hashSet.add(new Person("小晶",23));
        hashSet.add(new Person("小郭",24));
        hashSet.add(new Person("小郭",24));

        System.out.println(hashSet.size());

        Iterator iterator = hashSet.iterator();
        for(int i = 0; i < hashSet.size(); i++){
            System.out.println(iterator.next());
        }
        /*while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }

    static class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        /*public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }*/

        @Override
        public int hashCode(){
            System.out.println("hashCode:" + this.name);
            return this.name.hashCode() + this.age;
        }

        @Override
        public boolean equals(Object obj){
            System.out.println(this + "-----equals-----" + obj);
            if(obj instanceof Person){
                Person person = (Person) obj;
                return this.name.equals(person.name) && this.age == person.age;
            }
            return false;
        }

    }
}
