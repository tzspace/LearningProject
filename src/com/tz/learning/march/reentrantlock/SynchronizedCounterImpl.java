package com.tz.learning.march.reentrantlock;

public class SynchronizedCounterImpl implements ICounter{

    private long value = 0;

    @Override
    public synchronized long get() {
        return value;
    }

    @Override
    public synchronized long incremental() {
        return value++;
    }

    @Override
    public synchronized long decremental() {
        return value--;
    }
}
