package com.tz.learning.march.practice.thread.threadgroup.deadlockdemo;

public class DeadLockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource("r1", 10);
        Resource r2 = new Resource("r2", 20);

        Thread t1 = new Thread(() -> {
            for(int i =0; i < 20; i++){
                r1.cooperate(r2);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i =0; i < 30; i++){
                r2.cooperate(r1);
            }
        });

        t1.start();
        t2.start();
    }
}
