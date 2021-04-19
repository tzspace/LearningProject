package com.tz.learning.march.reentrantlock;

public class SynchronizedTesting {
    public static void main(String[] args) {
        SynchronizedCounterImpl sync = new SynchronizedCounterImpl();
        Thread t1 = new Thread(()->{
           for(int i =0; i< 100; i++){
               sync.incremental();
               System.out.println(sync.get());
           }
        });

        Thread t2 = new Thread(()->{
            for(int i =0; i< 100; i++){
                sync.decremental();
                System.out.println(sync.get());
            }
        });
        t1.start();
        t2.start();
    }
}
