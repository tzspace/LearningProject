package com.tz.learning.march.practice.queue;

public abstract class Request {
    int i = 0;

    Request(int i){
        this.i = i;
    }
    abstract void execute();

    public int getI() {
        return i;
    }
}
