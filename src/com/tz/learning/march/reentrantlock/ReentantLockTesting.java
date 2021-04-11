package com.tz.learning.march.reentrantlock;

public class ReentantLockTesting {
    public static void main(String[] args) {
        ReentrantNotFairLockImpl reen = new ReentrantNotFairLockImpl();
        Thread t3 = new Thread(()->{
            for(int i =0; i< 100; i++){
                reen.incremental();
                System.out.println(reen.get());
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    reen.decremental();
                    System.out.println(reen.get());
                }
            }
        });
        t3.start();
        t4.start();
    }
}
