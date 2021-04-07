package com.tz.learning.march.practice.TortoiseAndHare;

public class TortoiseHareRace {
    public static void main(String[] args){
        TortoiseRunning torRunning = new TortoiseRunning(10);
        HareRunning hareRunning = new HareRunning(10);

        Thread t1 = new Thread(torRunning);
        t1.start();
        //t1.start();
        new Thread(hareRunning).start();
    }
}
