package com.tz.learning.march.practice.thread.threadgroup.threadgroup;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");
        Thread t1 = new Thread(group, () -> {
            throw new RuntimeException("thread1抛出了异常");
        });
        t1.setUncaughtExceptionHandler((thread, throwable) ->{
            System.out.printf("%s, %s%n", thread.getName(), throwable.getMessage());
        });

        Thread t2 = new Thread(group,() -> {
           throw new RuntimeException("thread2抛出了异常");
        });
        t1.start();
        t2.start();
;    }
}
