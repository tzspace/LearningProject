package com.tz.learning.march.practice.TortoiseAndHare;

public class HareRunning extends Thread {
    private int totalSteps;
    private int step;
    private boolean[] flags = {true,false};

    HareRunning(int totalSteps){
        this.totalSteps = totalSteps;
    }

    @Override
    public void run(){
        while(step < totalSteps){
            boolean isSleep = flags[(int)(Math.random()*10 % 2)];
            if(isSleep){
                System.out.println("兔子睡觉中..................");
                continue;
            }
            step += 2;
            System.out.printf("兔子往前走了%s步,一共走了%s步 %n", 2, step);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
