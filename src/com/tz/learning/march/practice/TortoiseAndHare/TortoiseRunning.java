package com.tz.learning.march.practice.TortoiseAndHare;

public class TortoiseRunning extends Thread {
    private int totalSteps;
    private int step;

    TortoiseRunning(int totalSteps){
        this.totalSteps = totalSteps;
    }

    @Override
    public void run() {
        while(step < totalSteps){
            step++;
            System.out.printf("乌龟往前走了%s步,一共走了%s步 %n", 1, step);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
