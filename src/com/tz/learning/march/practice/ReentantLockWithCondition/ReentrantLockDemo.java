package com.tz.learning.march.practice.ReentantLockWithCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    Lock lock = new ReentrantLock();

    final Condition notFull = lock.newCondition();

    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[100];

    int putIndex;

    int takeIndex;

    int count;

    public void Put(Object object) throws InterruptedException{
        lock.lock();
        try{
            while(count == items.length){
                notEmpty.await();
            }
            items[putIndex] = object;
            if(++putIndex == items.length)
                putIndex =0;

            ++count;
            notFull.signal();
        }finally {
            lock.unlock();
        }
    }
}
