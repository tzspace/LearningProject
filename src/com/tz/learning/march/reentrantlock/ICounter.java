package com.tz.learning.march.reentrantlock;

public interface ICounter {
    long get();
    long incremental();
    long decremental();
}
