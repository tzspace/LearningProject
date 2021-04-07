package com.tz.learning.march.practice.thread.threadgroup.nodeadlockdemo;

public class NoDeadLockDemo {
    public static void main(String[] args) {
        Resources r1 = new Resources("r1");
        Resources r2 = new Resources("r2");

        Thread t1 = new Thread(() ->{
           for(int i = 0; i < 16; i++){
               r1.cooperate(r2);
           }
        });

        Thread t2 = new Thread(() -> {
           for(int j =0; j < 30; j++){
               r2.cooperate(r1);
           }
        });

        t1.start();
        t2.start();
    }
}
