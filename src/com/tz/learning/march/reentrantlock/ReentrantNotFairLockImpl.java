package com.tz.learning.march.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantNotFairLockImpl implements ICounter{

    final Lock lock = new ReentrantLock();
    private long value = 0;

    @Override
    public long get() {
        return value;
    }

    @Override
    public long incremental() {
        lock.lock();
        try{
            value++;
            return value;
        }finally {
            lock.unlock();
        }
    }

    @Override
    public long decremental() {
        lock.lock();
        try{
            value++;
            return value;
        }finally {
            lock.unlock();
        }
    }
}
