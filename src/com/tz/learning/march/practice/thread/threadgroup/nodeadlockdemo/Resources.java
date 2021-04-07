package com.tz.learning.march.practice.thread.threadgroup.nodeadlockdemo;

import java.util.concurrent.locks.ReentrantLock;

public class Resources {
    private ReentrantLock lock = new ReentrantLock();
    private String name;

    Resources(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void cooperate(Resources resource) {
        while(true){
            try{
                if(lockMeAnd(resource)){
                    System.out.printf("%s 整合 %s 的资源%n", this.name, resource.name);
                    break;
                }
            } finally {
                unLockMeAnd(resource);
            }
        }
    }

    boolean lockMeAnd(Resources res){
        return this.lock.tryLock() && res.lock.tryLock();
    }

    void unLockMeAnd(Resources res){
        if(this.lock.isHeldByCurrentThread()){
            this.lock.unlock();
        }
        if(res.lock.isHeldByCurrentThread()){
            res.lock.unlock();
        }
    }
}
